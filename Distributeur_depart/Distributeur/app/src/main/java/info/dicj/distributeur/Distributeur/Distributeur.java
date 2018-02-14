package info.dicj.distributeur.Distributeur;

import java.util.HashMap;
import java.util.Set;

import info.dicj.distributeur.Distributeur.exception.DebordementMelangeException;
import info.dicj.distributeur.Distributeur.impl.Bacon;
import info.dicj.distributeur.Distributeur.impl.Epice;
import info.dicj.distributeur.Distributeur.impl.Fraise;
import info.dicj.distributeur.Distributeur.impl.Gingembre;
import info.dicj.distributeur.Distributeur.impl.Orangeade;
import info.dicj.distributeur.Distributeur.impl.Pepsi;
import info.dicj.distributeur.Distributeur.impl.Racinette;

/**
 * Created by ludod on 14/01/2018.
 */

public class Distributeur {
    private HashMap<String,Distribuable> produits;
    private Melange melangePrecedent;
    private Melange melangeCourant;

    public Distributeur(){
        produits = new HashMap<>();
        remplirDistributeur();
    }
    private void remplirDistributeur(){
        produits.put("BACON",new Bacon());
        produits.put("EPICE",new Epice());
        produits.put("GINGEMBRE",new Gingembre());
        produits.put("PEPSI",new Pepsi());
        produits.put("FRAISE",new Fraise());
        produits.put("ORANGEADE",new Orangeade());
        produits.put("RACINETTE",new Racinette());
    }

    public Recette melangerRecette(){ return melangeCourant;}

    public void nouveauMelange(){
        if(melangeCourant != null) melangePrecedent = melangeCourant;
        else melangePrecedent=null;
        melangeCourant = new Melange();
    }

    public Recette dupliquerMelange(){return melangeCourant.getRecette();}

    public void ajouterBoisson(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterBoisson((Boisson)produits.get(nom));
    }

    public void ajouterSaveur(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterSaveur((Saveur)produits.get(nom));
    }
}
