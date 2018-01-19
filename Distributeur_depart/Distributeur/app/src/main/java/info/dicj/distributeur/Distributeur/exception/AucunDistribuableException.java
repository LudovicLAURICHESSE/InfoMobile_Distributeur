package info.dicj.distributeur.Distributeur.exception;

import android.util.Log;

/**
 * Created by ludod on 14/01/2018.
 */

public class AucunDistribuableException extends Exception {
    private String message;

    public AucunDistribuableException(String message) {
        this.message = message;
        Log.i("DICJ",message);
    }
}
