package info.dicj.distributeur.Distributeur;

import java.util.HashMap;

import info.dicj.distributeur.Distributeur.exception.DebordementMelangeException;

/**
 * Created by ludod on 14/01/2018.
 */

public class Distributeur {
    private HashMap<String,Boisson> boissons;
    private HashMap<String,Saveur> saveurs;
    private Melange melangePrecedent;
    private Melange melangeCourant;

    public Distributeur(){}
    private void remplirDistributeur(){}

    public Recette melangerRecette(){ return null;}

    public void nouveauMelange(){
        melangePrecedent = melangeCourant;
        melangeCourant = new Melange();
    }

    public Recette dupliquerMelange(){return null;}

    public void ajouterBoisson(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterBoisson(boissons.get(nom));
    }

    public void ajouterSaveur(String nom) throws DebordementMelangeException {
        melangeCourant.ajouterSaveur(saveurs.get(nom));
    }
}
