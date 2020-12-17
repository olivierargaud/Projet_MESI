package pojos;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

public class CaseCarte extends JPanel implements Serializable
{
    private Integer posX;
    private Integer posY;

    private Decor decor;

    private BlocColision blocColision;

    private String typeDeSol;




    public CaseCarte()
    {

    }

    public CaseCarte(Integer posX, Integer posY, Decor decor, BlocColision blocColision, String typeDeSol)
    {
        this.posX = posX;
        this.posY = posY;
        this.decor = decor;
        this.blocColision = blocColision;
        this.typeDeSol = typeDeSol;
    }





    public Integer getPosX()
    {
        return posX;
    }

    public void setPosX(Integer posX)
    {
        this.posX = posX;
    }

    public Integer getPosY()
    {
        return posY;
    }

    public void setPosY(Integer posY)
    {
        this.posY = posY;
    }

    public Decor getDecor()
    {
        return decor;
    }

    public void setDecor(Decor decor)
    {
        this.decor = decor;
    }

    public BlocColision getBlocColision()
    {
        return blocColision;
    }

    public void setBlocColision(BlocColision blocColision)
    {
        this.blocColision = blocColision;
    }

    public String getTypeDeSol()
    {
        return typeDeSol;
    }

    public void setTypeDeSol(String typeDeSol)
    {
        this.typeDeSol = typeDeSol;
    }







}
