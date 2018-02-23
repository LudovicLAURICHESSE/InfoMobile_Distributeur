package info.dicj.distributeur.Distributeur;

import android.util.Log;

import java.util.HashMap;
import java.util.Set;

import info.dicj.distributeur.Distributeur.exception.AucunDistribuableException;
import info.dicj.distributeur.Distributeur.exception.AucunMelangeException;
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
    private HashMap<String,Boisson> boissons;
    private HashMap<String,Saveur> saveurs;
    private Melange melangePrecedent;
    private Melange melangeCourant;

    public Distributeur(){
        boissons = new HashMap<>();
        saveurs = new HashMap<>();
        remplirDistributeur();
        melangeCourant = new Melange();
        melangePrecedent = new Melange();
    }
    private void remplirDistributeur(){
        saveurs.put("BACON",new Bacon());
        saveurs.put("EPICE",new Epice());
        saveurs.put("GINGEMBRE",new Gingembre());
        boissons.put("PEPSI",new Pepsi());
        boissons.put("FRAISE",new Fraise());
        boissons.put("ORANGEADE",new Orangeade());
        boissons.put("RACINETTE",new Racinette());
    }

    public Recette melangerRecette(){ return melangeCourant;}

    public void nouveauMelange(){
        if(melangeCourant != null) melangePrecedent = melangeCourant;
        else melangePrecedent=null;
        melangeCourant = new Melange();
    }

    public Recette dupliquerMelange()throws AucunMelangeException,AucunDistribuableException,DebordementMelangeException{
        if(melangePrecedent==null)throw new AucunMelangeException("Aucun mélange précèdent !");
        if(!melangePrecedent.estPret())throw new AucunDistribuableException("Aucune Boisson ou Saveur !");
        if(melangePrecedent.getNbBoisson()>2)throw new DebordementMelangeException("Trop de boisson!");
        melangeCourant=melangePrecedent;
        return melangePrecedent.getRecette();}

    public void ajouterBoisson(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterBoisson(boissons.get(nom));
    }

    public void ajouterSaveur(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterSaveur(saveurs.get(nom));
    }
}
