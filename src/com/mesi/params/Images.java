package com.mesi.params;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Images
{


    public static BufferedImage TRUNK;
    public static BufferedImage FOLIAGE;

    public Images()
    {
        try
        {
            FOLIAGE = ImageIO.read(new File("res/images/tree-foliage.png"));

            TRUNK = ImageIO.read(new File("res/images/tree-trunk.png"));



        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


    }
}
