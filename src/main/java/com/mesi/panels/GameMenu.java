package com.mesi.panels;

import com.mesi.MainZeldo;
import com.mesi.params.Backup;
import com.mesi.params.KeyMap;
import com.mesi.sound.Player;
import com.mesi.sound.Sounds;
import org.apache.log4j.Logger;

import javax.sound.sampled.LineUnavailableException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

public class GameMenu extends JDialog {

    /**********  Attributes  **********/

    private static Logger logger = Logger.getLogger(GameMenu.class);

    private JPanel panelPrinc = new JPanel();

    private JButton btnRetourAuJeu = new JButton("RETOUR AU JEU");
    private JButton btnEnregistrer = new JButton("ENREGISTRER");
    private JButton btnCharger = new JButton("CHARGER");
    private JButton btnInventory = new JButton("INVENTAIRE");
    private JButton btnMenuPrincipal = new JButton("MENU PRINCIPAL");
    private JButton btnQuitter = new JButton("QUITTER");

    private ArrayList<JButton> listeBtn = new ArrayList<>();

    private int indexSelection = 0;

    /**********  Constructors  **********/

    public GameMenu() {
        setSize(300, 400);
        setUndecorated(true);
        setModal(false);
        setFocusable(true);
        setLocationRelativeTo(null);

        listeBtn.add(btnRetourAuJeu);
        listeBtn.add(btnEnregistrer);
        listeBtn.add(btnCharger);
        listeBtn.add(btnInventory);
        listeBtn.add(btnMenuPrincipal);
        listeBtn.add(btnQuitter);

        add(getPanelPrinc());

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Méthode inutilisée
            }

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyMap.ESCAPE) {
                    Game.setPause(false);
                    dispose();
                }

                if (e.getKeyCode() == KeyMap.UP) {
                    new Player(Sounds.MENU, false);
                    indexSelection--;
                    if (indexSelection < 0) {
                        indexSelection = listeBtn.size() - 1;
                    }
                    selectButton(indexSelection);
                }

                if (e.getKeyCode() == KeyMap.DOWN) {
                    new Player(Sounds.MENU, false);
                    indexSelection++;
                    if (indexSelection >= listeBtn.size()) {
                        indexSelection = 0;
                    }
                    selectButton(indexSelection);
                }

                if (e.getKeyCode() == KeyMap.ENTER) {
                    new Player(Sounds.MENU_CLIC, false);
                    listeBtn.get(indexSelection).doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Méthode inutilisée
            }
        });

        setVisible(true);

        btnRetourAuJeu.setBackground(Color.GREEN);
    }

    /**********  Methods  **********/

    /**
     * Configuration du menu in game.
     *
     * @return
     */
    public JPanel getPanelPrinc() {
        panelPrinc.setBackground(Color.LIGHT_GRAY);

        GroupLayout layout = new GroupLayout(panelPrinc);

        int largeurBtn = 140;
        int hauteurBtn = 20;

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(getBtnRetourAuJeu(), largeurBtn, largeurBtn, largeurBtn)
                        .addComponent(getBtnEnregistrer(), largeurBtn, largeurBtn, largeurBtn)
                        .addComponent(getBtnCharger(), largeurBtn, largeurBtn, largeurBtn)
                        .addComponent(getBtnInventory(), largeurBtn, largeurBtn, largeurBtn)
                        .addComponent(getBtnMenuPrincipal(), largeurBtn, largeurBtn, largeurBtn)
                        .addComponent(getBtnQuitter(), largeurBtn, largeurBtn, largeurBtn)
                )
                .addGap(0, 0, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGap(10, 10, Short.MAX_VALUE)
                .addComponent(btnRetourAuJeu, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(20)
                .addComponent(btnEnregistrer, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(20)
                .addComponent(btnCharger, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(20)
                .addComponent(btnInventory, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(20)
                .addComponent(btnMenuPrincipal, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(20)
                .addComponent(btnQuitter, hauteurBtn, hauteurBtn, hauteurBtn)
                .addGap(10, 10, Short.MAX_VALUE)
        );

        panelPrinc.setLayout(layout);

        return panelPrinc;
    }

    /**
     * Ferme le menu et retourne à la partie.
     *
     * @return
     */
    public JButton getBtnRetourAuJeu() {
        btnRetourAuJeu.setFocusable(false);
        btnRetourAuJeu.setBackground(Color.LIGHT_GRAY);

        btnRetourAuJeu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.setPause(false);
                dispose();
            }
        });

        return btnRetourAuJeu;
    }

    /**
     * Retour au menu principal.
     *
     * @return
     */
    public JButton getBtnMenuPrincipal() {
        btnMenuPrincipal.setFocusable(false);
        btnMenuPrincipal.setBackground(Color.LIGHT_GRAY);

        btnMenuPrincipal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.setPause(false);
                Game.setKillThread(true);
                dispose();
                MainZeldo.generic = new Player(Sounds.GENERIC_START, true);
                MainZeldo.setGameState(MainZeldo.GameState.START_MENU);
                MainZeldo.setGameStateChange(true);
            }
        });

        return btnMenuPrincipal;
    }

    /**
     * Enregistre la partie en cours.
     *
     * @return
     */
    public JButton getBtnEnregistrer() {
        btnEnregistrer.setFocusable(false);
        btnEnregistrer.setBackground(Color.LIGHT_GRAY);

        btnEnregistrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Backup().save("save_1");
                } catch (IOException ioException) {
                    logger.error("Erreur lors de la sauvegarde");
                }
            }
        });

        return btnEnregistrer;
    }

    /**
     * Charge la dernière partie sauvegardée.
     *
     * @return
     */
    public JButton getBtnCharger() {
        btnCharger.setFocusable(false);
        btnCharger.setBackground(Color.LIGHT_GRAY);

        btnCharger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Game.setPause(false);
                Game.setKillThread(true);
                dispose();
                new Backup().load("save_1");
            }
        });

        return btnCharger;
    }

    /**
     * Ouvre l'inventaire.
     *
     * @return
     */
    public JButton getBtnInventory() {
        btnInventory.setFocusable(false);
        btnInventory.setBackground(Color.LIGHT_GRAY);

        btnInventory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Inventory();
            }
        });

        return btnInventory;
    }

    /**
     * Retourne à Windows.
     *
     * @return
     */
    public JButton getBtnQuitter() {
        btnQuitter.setFocusable(false);
        btnQuitter.setBackground(Color.LIGHT_GRAY);

        btnQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        return btnQuitter;
    }

    /**
     * Fais défiler le sélecteur lorsqu'on appuie sur les flèches de direction.
     *
     * @param buttonNumber
     */
    public void selectButton(int buttonNumber) {
        for (int i = 0; i < listeBtn.size(); i++) {
            listeBtn.get(i).setBackground(Color.LIGHT_GRAY);
        }

        listeBtn.get(buttonNumber).setBackground(Color.GREEN);
    }
}