package info.dicj.distributeur.Distributeur;

/**
 * Created by ludod on 14/01/2018.
 */

public class Saveur extends Distribuable {
    public Saveur( String nom, String description) {
        super(1, nom, description);
    }

    @Override
    public String toString(){
        return getNom() + getDescription();
    }
}
