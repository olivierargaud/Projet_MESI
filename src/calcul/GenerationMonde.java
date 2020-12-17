package calcul;

import pojos.Carte;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;

public class GenerationMonde implements Serializable
{


    public static Map<String, Carte> carteMap= new Hashtable();

    public GenerationMonde()
    {

        Carte carte = new Carte( 0,  0 );
        carteMap.put(carte.getCoord(),carte);



    }






}
