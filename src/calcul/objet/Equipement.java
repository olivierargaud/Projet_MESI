package calcul.objet;

import java.awt.image.BufferedImage;
public class Equipement
{

    private BufferedImage sprite ;

    private BufferedImage img;




    public Equipement()
    {

    }

    public Equipement(BufferedImage sprite)
    {
        this.sprite = sprite;
    }


    public BufferedImage getSprite()
    {
        return sprite;
    }

    public void setSprite(BufferedImage sprite)
    {
        this.sprite = sprite;
    }

    public BufferedImage getImg(Integer direction , Integer phaseAnim)
    {
        img = sprite.getSubimage(64*phaseAnim,64*direction,64,64);

        return img;
    }

    public void setImg(BufferedImage img)
    {
        this.img = img;
    }





}
