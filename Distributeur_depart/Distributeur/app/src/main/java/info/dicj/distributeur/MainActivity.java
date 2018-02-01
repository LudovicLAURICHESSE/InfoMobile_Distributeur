package info.dicj.distributeur;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import info.dicj.distributeur.Distributeur.Distributeur;

public class MainActivity extends AppCompatActivity{

    private Distributeur distributeur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.distributeur);

        distributeur = new Distributeur();

        Log.i("DICJ", "MainActivity.oncreate");
    }

    public void reverser(View view) {

        Log.i("DICJ", "MainActivity.reverser");

        /*
        try {
            distributeur.dupliquerMelange();
            verser(view);
        } catch (AucunMelangeException e) {
            e.printStackTrace();
        } catch (AucunDistribuableException e) {
            e.printStackTrace();
        } catch (DebordementMelangeException e) {
            e.printStackTrace();
        }
        */
    }

    public void verser(View view) {

        Log.i("DICJ", "MainActivity.verser");

        /*
        try {
            afficherRecette(distributeur.melangerRecette());

        } catch (AucunMelangeException e) {
            e.printStackTrace();
        }
        */
    }


    public void ajouterSaveur(View view) {

        Log.i("DICJ", "MainActivity.ajouterSaveur");

        /*
        try {
            switch(view.getId()){

                case R.id.sEpice:       distributeur.ajouterSaveur("EPICE");
                                        break;
                case R.id.sGingembre:   distributeur.ajouterSaveur("GINGEMBRE");
                                        break;
                case R.id.sBacon:       distributeur.ajouterSaveur("BACON");
                                        break;
            }
        } catch (AucunDistribuableException e) {
            e.printStackTrace();
        } catch (DebordementMelangeException e) {
            e.printStackTrace();
        }
        */
    }

    public void ajouterBoisson(View view) {

        Log.i("DICJ", "MainActivity.ajouterBoisson");

        /*
        try {
            switch(view.getId()){
                case R.id.bPepsi:       distributeur.ajouterBoisson("PEPSI");
                                        break;
                case R.id.bOrangeade:   distributeur.ajouterBoisson("ORANGEADE");
                                        break;
                case R.id.bRacinette:   distributeur.ajouterBoisson("RACINETTE");
                                        break;
                case R.id.bFraise:      distributeur.ajouterBoisson("FRAISE");
                                        break;
            }
        } catch (AucunDistribuableException e) {
            e.printStackTrace();
        } catch (DebordementMelangeException e) {
            e.printStackTrace();
        }
        */
    }

    public void nouveau(View view) {

        Log.i("DICJ", "MainActivity.nouveau");

        /*
        distributeur.nouveauMelange();
        */
    }

    public void changerVisibiliteBouttonVerser2(View view) {
        Button verser2 = ((Button)findViewById(R.id. boutton_verser_precedent));
        if (verser2.getVisibility()==View.GONE)
            verser2.setVisibility(View.VISIBLE);
        else
            verser2.setVisibility(View.GONE);
    }

    public void changerMessageAdore(View view) {
        changerMessage(true);
    }

    public void changerMessageNonAdore(View view) {
        changerMessage(false);
    }

    /*
    public void afficherRecette(Recette recette){


        Context context = getApplicationContext();
        CharSequence information = recette.getInformation();
        int duree = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, information, duree);
        toast.show();
    }
    */

    private void changerMessage(boolean adore) {
        TextView message = ((TextView)findViewById(R.id.testAdore));
        TextView nom = ((TextView)findViewById(R.id.nom));

        if (nom.getText() == null || nom.getText().toString().isEmpty()){
            message.setText(R.string.message_nom_abs);
        }
        else if (adore){
            message.setText("Bonjour " + nom.getText().toString() + " merci de ton entrain!");
        }
        else {
            message.setText("Bonjour " + nom.getText().toString() + " ne perds pas espoir!");
        }
    }



}
