package affichage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import calcul.MainZeldo;
import calcul.fonction_maison.Couleur;
import calcul.objet.Carte;
import calcul.objet.CaseCarte;
import calcul.objet.equipement.Equipement;
import calcul.objet.perso.Perso;

public class AnimationZeldo extends Carte
{

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	private ArrayList<Perso> listPerso = new ArrayList<Perso>();
//	private ArrayList<CaseCarte> listCase = new ArrayList<CaseCarte>();

	private Carte carte;

	private Hashtable<String, CaseCarte> listeCase = new Hashtable<String, CaseCarte>();
//	private Hashtable<String, Perso> listePerso = new Hashtable<String, Perso>();

	private boolean raz = false;
	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public AnimationZeldo(Carte carte)
	{

		this.carte = carte;

		listPerso.clear();
		listPerso = carte.getListPerso();
		listPerso.add(MainZeldo.link);

		System.out.println("liste perso "+listPerso.size());

	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public ArrayList<Perso> getListPerso()
	{
		return listPerso;
	}

//	public ArrayList<CaseCarte> getListCase()
//	{
//		return listCase;
//	}

	public Hashtable<String,CaseCarte> getListeCaseCarte()
	{
		return listeCase;
	}

//	public Hashtable<String,Perso>getListePerso()
//	{
//		return listePerso;
//	}

	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------SETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void setListePerso(ArrayList<Perso> listPerso)
	{
		this.listPerso = listPerso;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void refreshTotal()
	{
		raz = true;
		carte = MainZeldo.carteActuelle;
		listPerso = carte.getListPerso();
		listeCase = carte.getListeCase();
	}

	public void refreshPartiel()
	{

	}

	public void paintComponent(Graphics g)
	{

		// --------------------------------------------------------------------------------------------------------------------

		// fond ecran raz
		if (raz)
		{
			g.setColor(Couleur.Black);
			g.fillRect(0, 0, Short.MAX_VALUE, Short.MAX_VALUE);
			raz= false;
		}
		
		
		
		Enumeration<CaseCarte> e = listeCase.elements();
		while(e.hasMoreElements())
		{

			CaseCarte caseTemp =(CaseCarte) e.nextElement();
			
			
			switch (caseTemp.getType())
			{

				case "sol":
				{
					g.setColor(Couleur.Gray_6);
					g.fillRect
					(
						caseTemp.getX() * CaseCarte.caseWidth,
						caseTemp.getY() * CaseCarte.caseHeight,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
					break;
		
				case "mur":
				{
					g.setColor(Couleur.Brown_2);
					g.fillRect
					(
						caseTemp.getX() * CaseCarte.caseWidth,
						caseTemp.getY() * CaseCarte.caseHeight,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
					break;
		
				case "herbe":
				{
					g.setColor(Couleur.Green_3);
					g.fillRect
					(
						caseTemp.getX() * CaseCarte.caseWidth,
						caseTemp.getY() * CaseCarte.caseHeight,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
					break;
		
				case "arbre":
				{
					g.setColor(Couleur.Green_1);
					g.fillRect
					(
						caseTemp.getX() * CaseCarte.caseWidth,
						caseTemp.getY() * CaseCarte.caseHeight,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
					break;
					
				case "eau":
				{
					g.setColor(Couleur.Blue_3);
					g.fillRect
					(
						caseTemp.getX() * CaseCarte.caseWidth,
						caseTemp.getY() * CaseCarte.caseHeight,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
					break;
		
				default:
				{
					
				}
					break;

			}

			if (caseTemp.getObjetDecor() != null)
			{
				g.drawImage
				(
					caseTemp.getObjetDecor().getImage(),
					caseTemp.getX() * CaseCarte.caseWidth ,
					caseTemp.getY() * CaseCarte.caseHeight ,
					this
				);
			}
			
		}


		// personnages
		for (int i = 0; i < listPerso.size(); i++)
		{
//			System.out.println("perso dans anim "+listPerso.get(i).getType());

			if (listPerso.get(i).getType().equals("Link"))
			{
				// passe en bleu la case ciblé par zeldo
				try
				{
					g.setColor(new Color(0,255,255,100));
					g.fillRect
					(
						MainZeldo.link.getCaseDevant().getX()*CaseCarte.caseWidth ,
						MainZeldo.link.getCaseDevant().getY()*CaseCarte.caseHeight ,
						CaseCarte.caseWidth,
						CaseCarte.caseHeight
					);
				}
				catch (Exception exep)
				{
					System.out.println("case devant "+MainZeldo.link.getCaseDevant());
				}

				// passe en violet les cases a l'ouest de zeldo
				try
				{
					g.setColor(new Color(255,0,255,100));
					for (CaseCarte caseCarte:MainZeldo.link.getOuest())
					{
						g.fillRect
							(
								caseCarte.getX()*CaseCarte.caseWidth,
								caseCarte.getY()*CaseCarte.caseHeight,
								CaseCarte.caseWidth,
								CaseCarte.caseHeight
							);
					}
					for (CaseCarte caseCarte:MainZeldo.link.getEst())
					{
						g.fillRect
								(
										caseCarte.getX()*CaseCarte.caseWidth,
										caseCarte.getY()*CaseCarte.caseHeight,
										CaseCarte.caseWidth,
										CaseCarte.caseHeight
								);
					}
					for (CaseCarte caseCarte:MainZeldo.link.getNord())
					{
						g.fillRect
								(
										caseCarte.getX()*CaseCarte.caseWidth,
										caseCarte.getY()*CaseCarte.caseHeight,
										CaseCarte.caseWidth,
										CaseCarte.caseHeight
								);
					}
					for (CaseCarte caseCarte:MainZeldo.link.getSud())
					{
						g.fillRect
								(
										caseCarte.getX()*CaseCarte.caseWidth,
										caseCarte.getY()*CaseCarte.caseHeight,
										CaseCarte.caseWidth,
										CaseCarte.caseHeight
								);
					}

				}
				catch (Exception exep)
				{
					System.out.println("case devant "+MainZeldo.link.getCaseDevant());
				}

			}

//			System.out.println(listPerso.get(i).getImage());
//			System.out.println(listPerso.get(i).getPosXAnim());
//			System.out.println(listPerso.get(i).getPosYAnim());
			// affichage le personnage
			g.drawImage
			(
				listPerso.get(i).getImage(),
				listPerso.get(i).getPosXAnim() - CaseCarte.caseWidth/2,
				listPerso.get(i).getPosYAnim() - CaseCarte.caseHeight/2,
				this
			);

			// affiche l'equipement du personnage
			for (Equipement equipement:listPerso.get(i).getEquipementArrayList())
			{
				g.drawImage
				(
					equipement.getImg(listPerso.get(i).getDirection(),
					listPerso.get(i).getPhaseAnim()),
					listPerso.get(i).getPosXAnim() ,
					listPerso.get(i).getPosYAnim(),
					this
				);

			}


		}

	}

}
