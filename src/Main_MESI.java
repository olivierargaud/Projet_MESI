import affichage.EcranPrincipal;
import pojos.Carte;

import java.util.Hashtable;
import java.util.Map;

public class Main_MESI
{


    public static Map<String, Carte> carteMap= new Hashtable();

    public static Carte carteActuelle = new Carte();

    public static void main(String[] args)
    {

        System.out.println("coucou");
        new EcranPrincipal();

    }





}
