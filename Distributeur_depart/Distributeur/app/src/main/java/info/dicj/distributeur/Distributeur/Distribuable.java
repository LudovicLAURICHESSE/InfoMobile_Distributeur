package info.dicj.distributeur.Distributeur;

/**
 * Created by ludod on 14/01/2018.
 */

public class Distribuable implements Produit {
    private int quantite;
    private String nom;
    private String description;
    public static final int MAX=10;

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {

        this.quantite = quantite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Distribuable(int quantite, String nom, String description) {
        setNom(nom);
        setDescription(description);
        setQuantite(quantite);
    }

    @Override
    public boolean estVide() {
        return quantite>0 ? false : true;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void ajouter(){

    }
    public void consommer(){

    }
    @Override
    public String toString() {
        return "nom :"+this.getNom()+"/n description : "+this.getDescription();
    }
}
