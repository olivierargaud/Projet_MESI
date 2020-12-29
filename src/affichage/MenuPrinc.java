package affichage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import calcul.MainZeldo;
import calcul.fonction_maison.Couleur;

import javax.swing.GroupLayout.Alignment;

public class MenuPrinc extends JDialog
{

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	private JPanel panelPrinc = new JPanel();

	private JButton btnNouvellePartie = new JButton("NOUVELLE PARTIE");
	private JButton btnContinuer = new JButton("CONTINUER");
	private JButton btnQuitter = new JButton("QUITTER");

	private ArrayList<JButton> listeBtn = new ArrayList<JButton>();

	private	int indexSelection =0;
	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public MenuPrinc()
	{
		setSize(300, 400);
		setUndecorated(true);
		setModal(true);
	
		add(getPanelPrinc());

		setLocationRelativeTo(null);
		
		addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{}
			public void keyReleased(KeyEvent e)
			{}
			public void keyPressed(KeyEvent e)
			{
//				System.out.println(e.getKeyCode() + " Menu");

				// esc
				if (e.getKeyCode() == 27)
				{
					dispose();
				}
				
				// haut
				if (e.getKeyCode() == 38)
				{
					indexSelection--;
					if (indexSelection< 0)
					{
						indexSelection=listeBtn.size()-1;
					}
					selectionBoutton(indexSelection);	
				}

				// bas
				if (e.getKeyCode() == 40)
				{
					indexSelection++;
					if (indexSelection>= listeBtn.size())
					{
						indexSelection=0;
					}
					selectionBoutton(indexSelection);
				}


				// entrer
				if (e.getKeyCode() == 10)
				{
					listeBtn.get(indexSelection).doClick();	
				}
				
			}
		});

		initBtn();
		
		setVisible(true);

	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JPANEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public JPanel getPanelPrinc()
	{
		panelPrinc.setBackground(Couleur.Brown_1);

		GroupLayout layoutPrinc = new GroupLayout(panelPrinc);

		int largeurBtn = 140;
		int hauteurBtn = 20;

		layoutPrinc.setHorizontalGroup
		(
			layoutPrinc.createSequentialGroup()
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup
				(
					layoutPrinc.createParallelGroup(Alignment.CENTER)
						.addComponent(getBtnNouvellePartie(),largeurBtn,largeurBtn,largeurBtn)
						.addComponent(getBtnContinuer(),largeurBtn,largeurBtn,largeurBtn)
						.addComponent(getBtnQuitter(),largeurBtn,largeurBtn,largeurBtn)
				)
				.addGap(0, 0, Short.MAX_VALUE)
		);

		layoutPrinc.setVerticalGroup
		(
			layoutPrinc.createSequentialGroup()
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(getBtnNouvellePartie(),hauteurBtn, hauteurBtn,hauteurBtn)
				.addGap(20)
				.addComponent(getBtnContinuer(),hauteurBtn, hauteurBtn,hauteurBtn)
				.addGap(20)
				.addComponent(getBtnQuitter(),hauteurBtn, hauteurBtn,hauteurBtn)
				.addGap(10, 10, Short.MAX_VALUE)
		);

		panelPrinc.setLayout(layoutPrinc);

		return panelPrinc;
	}

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JTEXTFIELD----------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JLABEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JBUTTON-------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public JButton getBtnNouvellePartie()
	{
		btnNouvellePartie.setFocusable(false);
		btnNouvellePartie.setBackground(Color.LIGHT_GRAY);
		
		if (btnNouvellePartie.getActionListeners().length == 0)

		{
			btnNouvellePartie.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					MainZeldo.fen.nouvellePartie();
					dispose();
				}
			});
		}

		return btnNouvellePartie;
	}

	public JButton getBtnContinuer()
	{
		btnContinuer.setFocusable(false);
		btnContinuer.setBackground(Color.LIGHT_GRAY);
		
		if (btnContinuer.getActionListeners().length == 0)
		{
			btnContinuer.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					MainZeldo.fen.continuerPartie();
					dispose();
				}
			});
		}

		return btnContinuer;
	}

	public JButton getBtnQuitter()
	{
		btnQuitter.setFocusable(false);
		btnQuitter.setBackground(Color.LIGHT_GRAY);
		
		if (btnQuitter.getActionListeners().length == 0)
		{
			btnQuitter.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					MainZeldo.fen.fermeture();
					
					dispose();
				}
			});
		}

		return btnQuitter;
	}

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JCOMBOBOX-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------SETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
		
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void initBtn()
	{
		listeBtn.clear();
		
		listeBtn.add(btnNouvellePartie);
		listeBtn.add(btnContinuer);
		listeBtn.add(btnQuitter);
		
		btnNouvellePartie.setBackground(Color.GREEN);
	}
	
	public void selectionBoutton(int i)
	{
		for(int j =0 ;j<listeBtn.size();j++)
		{
			listeBtn.get(j).setBackground(Color.LIGHT_GRAY);
		}
		
		listeBtn.get(i).setBackground(Color.GREEN);
	}
	
	
}
