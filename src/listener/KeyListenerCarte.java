package listener;

import affichage.EcranPrincipal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerCarte implements KeyListener
{


    @Override
    public void keyTyped(KeyEvent e)
    {
        if (e.getKeyCode() == 37)
        {
            EcranPrincipal.gauche=false;
        }

        // haut
        if (e.getKeyCode() == 38)
        {
            EcranPrincipal.haut = false;
        }

        // droite
        if (e.getKeyCode() == 39)
        {
            EcranPrincipal.droite = false;
        }

        // bas
        if (e.getKeyCode() == 40)
        {
            EcranPrincipal.bas = false;
        }

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println(e.getKeyCode());

        // gauche
        if (e.getKeyCode() == 37)
        {
            EcranPrincipal.gauche = true;
        }

        // haut
        if (e.getKeyCode() == 38)
        {
            EcranPrincipal.haut = true;
        }

        // droite
        if (e.getKeyCode() == 39)
        {
            EcranPrincipal.droite = true;
        }

        // bas
        if (e.getKeyCode() == 40)
        {
            EcranPrincipal.bas = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e)
    {

    }



}
