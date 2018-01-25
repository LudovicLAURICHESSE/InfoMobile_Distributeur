package info.dicj.distributeur.Distributeur;


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
        nbBoisson =0;
    }

    @Override
    public String getInformation() {
        return "information";
    }

    public void ajouterBoisson (Boisson boisson) throws DebordementMelangeException {
        if (nbBoisson < MAX_BOISSONS){
            boissons[nbBoisson++]=boisson;
        }
        else throw new DebordementMelangeException("trop de boissons");
    }

    public void ajouterSaveur (Saveur saveurN) throws DebordementMelangeException {
        if (saveur.estVide())
            saveur=saveurN;
        else throw new DebordementMelangeException("trop de saveurs");
    }

    public Recette getRecette(){
        return null;
    }

    public boolean estPret(){
        return true;
    }
}
