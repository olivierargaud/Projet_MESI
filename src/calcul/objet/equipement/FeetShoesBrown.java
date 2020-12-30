package calcul.objet.equipement;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FeetShoesBrown extends Equipement
{

    public FeetShoesBrown()
    {
        try
        {
            setSprite(ImageIO.read(new File("res/image/FEET_shoes_brown.png")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
