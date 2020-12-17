package affichage;


import calcul.GenerationMonde;
import listener.KeyListenerCarte;

import javax.swing.*;
import java.awt.*;






public class EcranPrincipal extends JFrame
{



    public static boolean gauche = false;
    public static boolean droite = false;
    public static boolean haut = false;
    public static boolean bas = false;



    private boolean start = false;


    private Thread t;

    private int tempsDePause = 20;





    public EcranPrincipal()
    {
        setSize(1280, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(getPanelEcran());

        addKeyListener(new KeyListenerCarte());


        nouvellePartie();

    }

    public JPanel getPanelEcran()
    {
        JPanel panelEcran = new JPanel();
        panelEcran.setBackground(Color.CYAN);


        return panelEcran;
    }







    public void nouvellePartie()
    {
        if (start)
        {
            start = false;
            t.stop();
        }

        new GenerationMonde();


        if (!start)
        {
            start = true;
            t = new Thread(new Jeux());
            t.start();
        }

    }










    class Jeux implements Runnable
    {
        public void run()
        {

            System.out.println("instance lancée");
            zeldo();
        }
    }




    public void zeldo()
    {
        while (start)
        {

                // temps de pause entre deux pas
                try
                {
                    Thread.sleep(tempsDePause);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }

        } // fin while

    }






}
