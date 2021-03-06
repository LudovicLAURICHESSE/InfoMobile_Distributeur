package info.dicj.distributeur.Distributeur;
import android.util.Log;

import info.dicj.distributeur.Distributeur.exception.AucunDistribuableException;
import info.dicj.distributeur.Distributeur.exception.AucunMelangeException;
import info.dicj.distributeur.Distributeur.exception.DebordementMelangeException;

/**
 * Created by ludod on 14/01/2018.
 */

public class Melange implements Recette {
    private int nbBoisson;
    private static final int MAX_BOISSONS =2;
    private Boisson[] boissons;
    private Saveur saveur;

    public Melange(){
        boissons = new Boisson[2];
        saveur = null;
        nbBoisson =0;
    }

    @Override
    public String getInformation() throws AucunMelangeException {
        String info = " Votre mélange : \n Boisson(s) : \n";
        if(this==null){
            throw new AucunMelangeException("Pas de mélange !");
        }
        for (int i=0 ; i<nbBoisson ; i++)
        {
            info += " - " + boissons[i].getNom()+"\n";
        }
        if(saveur==null){
            info += "Aucune saveur. \n";
        }
        else {
            info += "Saveur : " + saveur.getNom()+"\n";
        }

        return info;
    }

    public void ajouterBoisson (Boisson boisson) throws DebordementMelangeException {
        if (nbBoisson < MAX_BOISSONS){
            boissons[nbBoisson++]=boisson;
        }
        else throw new DebordementMelangeException("trop de boissons");
    }

    public void ajouterSaveur (Saveur saveurN) throws DebordementMelangeException {
        if (saveur == null)
            saveur=saveurN;
        else throw new DebordementMelangeException("trop de saveurs");
    }

    public Recette getRecette(){
        return this;
    }

    public boolean estPret(){
        return true ? boissons.length !=0 : false;
    }

    public int getNbBoisson(){return nbBoisson;}
}
