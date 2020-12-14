package affichage;


import javax.swing.*;
import java.awt.*;

public class EcranPrincipal extends JFrame
{

    public EcranPrincipal()
    {
        setSize(900, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        add(getPanelEcran());

    }

    public JPanel getPanelEcran()
    {
        JPanel panelEcran = new JPanel();
        panelEcran.setBackground(Color.CYAN);
        panelEcran.add(new JTextArea("bonjour"));


        return panelEcran;
    }
}
