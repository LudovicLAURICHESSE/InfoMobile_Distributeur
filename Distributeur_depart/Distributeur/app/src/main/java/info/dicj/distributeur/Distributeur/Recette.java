package info.dicj.distributeur.Distributeur;

import info.dicj.distributeur.Distributeur.exception.AucunDistribuableException;
import info.dicj.distributeur.Distributeur.exception.AucunMelangeException;

/**
 * Created by ludod on 14/01/2018.
 */

public interface Recette {
     String getInformation()throws AucunMelangeException;
}
