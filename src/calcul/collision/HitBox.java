package calcul.collision;

import java.io.Serializable;

public class HitBox implements Serializable
{

    private Integer width;
    private Integer height;
    private Integer origineX;
    private Integer origineY;

    public HitBox()
    {
    }

    public HitBox(Integer origineX, Integer origineY, Integer width, Integer height )
    {
        this.width = width;
        this.height = height;
        this.origineX = origineX;
        this.origineY = origineY;
    }

    public Integer getWidth()
    {
        return width;
    }

    public void setWidth(Integer width)
    {
        this.width = width;
    }

    public Integer getHeight()
    {
        return height;
    }

    public void setHeight(Integer height)
    {
        this.height = height;
    }

    public Integer getOrigineX()
    {
        return origineX;
    }

    public void setOrigineX(Integer origineX)
    {
        this.origineX = origineX;
    }

    public Integer getOrigineY()
    {
        return origineY;
    }

    public void setOrigineY(Integer origineY)
    {
        this.origineY = origineY;
    }




    public void plusX(Integer pas)
    {
        origineX+=pas;
    }
    public void plusY(Integer pas)
    {
        origineY+=pas;
    }




}

