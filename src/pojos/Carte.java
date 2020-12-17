package pojos;

import javax.swing.*;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Map;

public class Carte extends JPanel implements Serializable
{

    private String coord;

    private Integer xMap;
    private Integer yMap;

    private String typeDeSol;

    private Map<String,CaseCarte> caseCarteMap = new Hashtable<String,CaseCarte>();


    public Carte()
    {


    }

    public Carte(Integer xMap, Integer yMap)
    {
        this.xMap = xMap;
        this.yMap = yMap;

        this.coord =""+xMap+" "+yMap;

        for (int i = 0; i < 19; i++)
        {
            for (int j = 0; j < 11; j++)
            {
                CaseCarte caseTemp = new CaseCarte();

                caseCarteMap.put(("" + i + " " + j), caseTemp);
            }
        }
    }

    public Carte(Integer xMap, Integer yMap, String typeDeSol, Map<String, CaseCarte> carteList)
    {
        this.xMap = xMap;
        this.yMap = yMap;
        this.typeDeSol = typeDeSol;
        this.caseCarteMap = carteList;


    }


    public String getCoord()
    {
        return coord;
    }

    public void setCoord(String coord)
    {
        this.coord = coord;
    }

    public Integer getxMap()
    {
        return xMap;
    }

    public void setxMap(Integer xMap)
    {
        this.xMap = xMap;
    }

    public Integer getyMap()
    {
        return yMap;
    }

    public void setyMap(Integer yMap)
    {
        this.yMap = yMap;
    }

    public String getTypeDeSol()
    {
        return typeDeSol;
    }

    public void setTypeDeSol(String typeDeSol)
    {
        this.typeDeSol = typeDeSol;
    }

    public Map<String, CaseCarte> getCaseCarteMap()
    {
        return caseCarteMap;
    }

    public void setCaseCarteMap(Map<String, CaseCarte> caseCarteMap)
    {
        this.caseCarteMap = caseCarteMap;
    }



}
