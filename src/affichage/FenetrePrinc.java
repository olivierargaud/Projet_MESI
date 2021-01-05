package affichage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;

import calcul.GenerationCarte;
import calcul.MainZeldo;
import calcul.collision.HitBox;
import calcul.collision.TestCollision;
import calcul.fonction_maison.Couleur;
import calcul.objet.CaseCarte;
import calcul.objet.perso.PNJ;
import calcul.objet.perso.Perso;
import calcul.objet.decor.Arbre;
import calcul.objet.decor.Coffre;
import calcul.objet.perso.Link;

public class FenetrePrinc extends JFrame
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final Integer NORD = 0;
	public static final Integer OUEST = 1;
	public static final Integer SUD = 2;
	public static final Integer EST = 3;

	public static final Integer PAS_PIXEL = 4;

	public static final Integer TEMPS_DE_PAUSE = 10;

	private JPanel panelPrinc = new JPanel();

	private JPanel panelEcranMenu = new JPanel();

	private JPanel panelEcran = new JPanel();

	private JLabel labelTitre = new JLabel("ZELDO");

	private JLabel labelCommentaire = new JLabel("ESC pour acceder au MENU");

	private Font fontTitre = new Font("Arial Bold Italic", 1, 120);

	private Font fontText = new Font("Arial Bold Italic", 1, 40);

	private boolean start = false;

	private AnimationZeldo anim;

	private Thread t;



	private boolean gauche = false;
	private boolean droite = false;
	private boolean haut = false;
	private boolean bas = false;

	private boolean init = true;


	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public FenetrePrinc()
	{
		setSize(1300, 788);
		setLocationRelativeTo(null);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		changeEcran(getPanelEcranMenu());

		add(getPanelPrinc());

		addKeyListener(new KeyListener()
		{
			public void keyTyped(KeyEvent e)
			{
			}

			public void keyReleased(KeyEvent e)
			{
				// gauche
				if (e.getKeyCode() == 37)
				{
					gauche = false;

					if(haut)
					{
						MainZeldo.link.setDirection(NORD);
					}
					if(bas)
					{
						MainZeldo.link.setDirection(SUD);
					}
					if(droite)
					{
						MainZeldo.link.setDirection(EST);
					}
				}

				// haut
				if (e.getKeyCode() == 38)
				{
					haut = false;

					if(gauche)
					{
						MainZeldo.link.setDirection(OUEST);
					}
					if(droite)
					{
						MainZeldo.link.setDirection(EST);
					}
					if(bas)
					{
						MainZeldo.link.setDirection(SUD);
					}
				}

				// droite
				if (e.getKeyCode() == 39)
				{
					droite = false;

					if(haut)
					{
						MainZeldo.link.setDirection(NORD);
					}
					if(bas)
					{
						MainZeldo.link.setDirection(SUD);
					}
					if(gauche)
					{
						MainZeldo.link.setDirection(OUEST);
					}
				}

				// bas
				if (e.getKeyCode() == 40)
				{
					bas = false;

					if(haut)
					{
						MainZeldo.link.setDirection(NORD);
					}
					if(gauche)
					{
						MainZeldo.link.setDirection(OUEST);
					}
					if(droite)
					{
						MainZeldo.link.setDirection(EST);
					}
				}

			}

			public void keyPressed(KeyEvent e)
			{
				System.out.println(e.getKeyCode());

				// gauche
				if (e.getKeyCode() == 37)
				{
					gauche = true;
					MainZeldo.link.setDirection(OUEST);
				}

				// haut
				if (e.getKeyCode() == 38)
				{
					haut = true;
					MainZeldo.link.setDirection(NORD);
				}

				// droite
				if (e.getKeyCode() == 39)
				{
					droite = true;
					MainZeldo.link.setDirection(EST);
				}

				// bas
				if (e.getKeyCode() == 40)
				{
					bas = true;
					MainZeldo.link.setDirection(SUD);
				}

				// Q
				if (e.getKeyCode() == 81)
				{
					System.out.println
					(
						"hitbox perso  x: " + MainZeldo.link.getHitBox().getOrigineX()
						+ " y: " +	MainZeldo.link.getHitBox().getOrigineY()
					);


					System.out.println("case :");
					for (CaseCarte caseCarte: MainZeldo.link.getOuest())
					{
						System.out.println("case " +caseCarte.getX() +" " +caseCarte.getY() );
						if(caseCarte.getObjetDecor()!=null)
						{
							System.out.println("objet :" + caseCarte.getObjetDecor().getTypeObjet());
						}
					}


					System.out.print("hitbox objet :");
					for (HitBox hitBox:MainZeldo.link.getCollicionOuest() )
					{
						System.out.println("hitbox   x : " + hitBox.getOrigineX() + " y " + hitBox.getOrigineY());
					}
					System.out.println(" ");

				}

				// Z
				if (e.getKeyCode() == 90)
				{
					// tempsDePause = 40;
				}

				// D
				if (e.getKeyCode() == 68)
				{
					// System.out.println("case devant avant deplacement
					// "+MainZelda.listePerso.get("Link").getCaseDevant().getAdresseCase());

				}

				// S
				if (e.getKeyCode() == 83)
				{
					// tempsDePause = 400;
				}

				// A
				if (e.getKeyCode() == 65)
				{
					if(MainZeldo.link.getCaseDevant().getType() == "herbe")
					{
						MainZeldo.link.planterUnArbre();
					}

				}

				// I
				if (e.getKeyCode() == 73)
				{

					System.out.println("info");
					System.out.println("nombre de perso "+MainZeldo.carteActuelle.getListPerso().size());
					for (Perso perso:MainZeldo.carteActuelle.getListPerso())
					{
						System.out.println("perso "+perso.getType());
					}
					System.out.println();
					
					// if(start)
					// {
					// MainZelda.inv = new Inventaire();
					// }
				}

				// barre espace
				if (e.getKeyCode() == 32)
				{
					 System.out.println("action");

					////////////////////////////////////////////////////////////////////
					// ouvrir un coffre
					if(MainZeldo.link.getCaseDevant().getObjetDecor() instanceof Coffre)
					{
						MainZeldo.link.ouvrirCoffre((Coffre) MainZeldo.link.getCaseDevant().getObjetDecor());
					}


					////////////////////////////////////////////////////////////////////
					// couper un arbre
					if (MainZeldo.link.getCaseDevant().getObjetDecor() instanceof Arbre)
					{
						MainZeldo.link.couperUnArbre();
					}

					////////////////////////////////////////////////////////////////////
					// parler a un PNJ
					if(MainZeldo.link.getCaseDevant().getPnj() instanceof PNJ)
					{
						System.out.println("on parle au PNJ");
					}



					// actionLink(MainZelda.listePerso.get("Link"));
				}

				// entrer
				if (e.getKeyCode() == 10)
				{

				}

				// esc
				if (e.getKeyCode() == 27)
				{
					haut = bas = gauche = droite = false ;
					new MenuPrinc();
				}
			}
		});

		setVisible(true);
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public AnimationZeldo getAnim()
	{
		return anim;
	}

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JPANEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public JPanel getPanelPrinc()
	{
		panelPrinc.setBackground(Couleur.Brown_1);

		GroupLayout layoutPrinc = new GroupLayout(panelPrinc);

		layoutPrinc.setHorizontalGroup
		(
			layoutPrinc.createSequentialGroup()
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(getPanelEcran(), 1280,1280, 1280)
				.addGap(10, 10, Short.MAX_VALUE)
		);

		layoutPrinc.setVerticalGroup
		(
			layoutPrinc.createSequentialGroup()
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(getPanelEcran(), 768,768, 768)
				.addGap(10, 10, Short.MAX_VALUE)
		);

		panelPrinc.setLayout(layoutPrinc);

		return panelPrinc;
	}

	public JPanel getPanelEcranMenu()
	{
		panelEcranMenu.setBackground(Couleur.Brown_2);

		GroupLayout layoutEcranMenu = new GroupLayout(panelEcranMenu);

		layoutEcranMenu.setHorizontalGroup
		(
			layoutEcranMenu.createSequentialGroup()
				.addGap(10, 10, Short.MAX_VALUE)
				.addGroup
				(
					layoutEcranMenu.createParallelGroup(Alignment.CENTER)
						.addComponent(getLabelTitre())
						.addGroup
						(
							layoutEcranMenu.createSequentialGroup()
								.addGap(10,10,Short.MAX_VALUE)
								.addComponent(getLabelCommentaire())
						)

				)
				.addGap(10, 10, Short.MAX_VALUE)
		);

		layoutEcranMenu.setVerticalGroup
		(
			layoutEcranMenu.createSequentialGroup()
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(getLabelTitre())
				.addGap(10, 10, Short.MAX_VALUE)
				.addComponent(getLabelCommentaire())
				.addGap(10, 10, Short.MAX_VALUE)
		);

		panelEcranMenu.setLayout(layoutEcranMenu);

		return panelEcranMenu;
	}

	public JPanel getPanelEcran()
	{
		return panelEcran;
	}

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JTEXTFIELD----------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JLABEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public JLabel getLabelTitre()
	{
		labelTitre.setFont(fontTitre);

		labelTitre.setForeground(Couleur.Black);

		return labelTitre;
	}

	public JLabel getLabelCommentaire()
	{
		labelCommentaire.setFont(fontText);

		labelCommentaire.setForeground(Couleur.Green_5);

		return labelCommentaire;
	}

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JBUTTON-------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

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

	public void changeEcran(JPanel panel)
	{
		panelPrinc.removeAll();
		panelEcran = panel;

		getPanelPrinc();
		panelPrinc.repaint();
		panelPrinc.setVisible(true);

	}

	@SuppressWarnings("deprecation")
	public void nouvellePartie()
	{
		if (start)
		{
			start = false;
			t.stop();
		}

		new GenerationCarte();

		MainZeldo.carteActuelle = MainZeldo.listeCarte.get("Maison Depart 0 0");

		Link link = new Link(3, 3, 1, "Link");
		try
		{
			link.setSprite(ImageIO.read(new File("res/image/BODY_male.png")));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

		link.setCarteActuelle(MainZeldo.carteActuelle);
		link.setHitBox(new HitBox(16,32,32,32));
//		try
//		{
//			Equipement pantalon = new Equipement();
//			pantalon.setSprite(ImageIO.read(new File("res/image/LEGS_pants_greenish.png")));
//			link.getEquipementArrayList().add(pantalon);
//		}
//		catch (IOException e)
//		{
//			e.printStackTrace();
//		}


		MainZeldo.link = link;

		anim = new AnimationZeldo(MainZeldo.carteActuelle);

		anim.refreshTotal();
		anim.repaint();
		
		changeEcran(anim);

		if (!start)
		{
			start = true;
			t = new Thread(new Jeux());
			t.start();
		}

	}

	public void continuerPartie()
	{

	}

	@SuppressWarnings("deprecation")
	public void fermeture()
	{
		if (start)
		{
			t.stop();
		}
		dispose();
	}

	public void zeldo()
	{
		while (start)
		{
			if (init)
			{
				anim.refreshTotal();
				init = false;
			}

			if (testPassage(MainZeldo.link))
			{
				System.out.println("youpi on se teleport");
				MainZeldo.link.setCarteActuelle(MainZeldo.carteActuelle);
				anim.refreshTotal();
				anim.repaint();

			}
			else
			{


				boolean nextAnim = false;



				if (gauche && !new TestCollision().isCollisioning(MainZeldo.link.getHitBox(),MainZeldo.link.getCollicionOuest()))
				{
					MainZeldo.link.setPosXAnim(MainZeldo.link.getPosXAnim() - PAS_PIXEL);
//					MainZeldo.link.getHitBox().plusX(-PAS_PIXEL);
					nextAnim = true;
				}
				if (haut && MainZeldo.link.getMoveHaut())
				{
					MainZeldo.link.setPosYAnim(MainZeldo.link.getPosYAnim() - PAS_PIXEL);
//					MainZeldo.link.getHitBox().plusY(-PAS_PIXEL);
					nextAnim = true;
				}
				if (droite && MainZeldo.link.getMoveDroite())
				{
					MainZeldo.link.setPosXAnim(MainZeldo.link.getPosXAnim() + PAS_PIXEL);
//					MainZeldo.link.getHitBox().plusX(PAS_PIXEL);
					nextAnim = true;
				}
				if (bas && MainZeldo.link.getMoveBas())
				{
					MainZeldo.link.setPosYAnim(MainZeldo.link.getPosYAnim() + PAS_PIXEL);
//					MainZeldo.link.getHitBox().plusY(PAS_PIXEL);
					nextAnim = true;
				}








//				if (gauche && MainZeldo.link.getMoveGauche())
//				{
//					MainZeldo.link.setPosXAnim(MainZeldo.link.getPosXAnim() - PAS_PIXEL);
//					nextAnim = true;
//				}
//				if (haut && MainZeldo.link.getMoveHaut())
//				{
//					MainZeldo.link.setPosYAnim(MainZeldo.link.getPosYAnim() - PAS_PIXEL);
//					nextAnim = true;
//				}
//				if (droite && MainZeldo.link.getMoveDroite())
//				{
//					MainZeldo.link.setPosXAnim(MainZeldo.link.getPosXAnim() + PAS_PIXEL);
//					nextAnim = true;
//				}
//				if (bas && MainZeldo.link.getMoveBas())
//				{
//					MainZeldo.link.setPosYAnim(MainZeldo.link.getPosYAnim() + PAS_PIXEL);
//					nextAnim = true;
//				}







				if(nextAnim)
				{
					MainZeldo.link.setPhaseAnim(MainZeldo.link.getPhaseAnim()+1);
				}

				anim.repaint();

				if(MainZeldo.link.getPhaseAnim()>=8)
				{
					MainZeldo.link.setPhaseAnim(0);
				}


//					System.out.println("direction " +MainZeldo.link.getDirection());

				// temps de pause entre deux pas
				try
				{
					Thread.sleep(TEMPS_DE_PAUSE);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}

				
			}

		} // fin while

	}


	public boolean testPassage(Perso perso)
	{
		boolean test = false;

		// on memorise temporairement la position de link
		CaseCarte caseDuPerso =	MainZeldo.carteActuelle.getListeCase().get
		(
			perso.getPosX()
			+ " "
			+ perso.getPosY()
		);

		// si link se trouve sur un tp on modifie la carteActuelle
		if (caseDuPerso.getTypePassage() != 0)
		{
			test = true;
			MainZeldo.carteActuelle = MainZeldo.listeCarte.get(caseDuPerso.getCarteDestination());
			// on transfert link sur la nouvelle carte
			MainZeldo.carteActuelle.getListPerso().add(MainZeldo.link);
			// fixe la futur position X du perso
			if(caseDuPerso.getPosXDestination()>=0)
			{
				MainZeldo.link.setPosX(caseDuPerso.getPosXDestination());
			}
			if(caseDuPerso.getPosYDestination()>=0)
			{
				MainZeldo.link.setPosY(caseDuPerso.getPosYDestination());
			}

		}

		return test;
	}

	class Jeux implements Runnable
	{
		public void run()
		{

			System.out.println("instance lancée");
			zeldo();
		}
	}

}
