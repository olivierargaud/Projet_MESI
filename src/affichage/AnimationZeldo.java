package affichage;

import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

import calcul.MainZeldo;
import calcul.fonction_maison.Couleur;
import calcul.objet.Carte;
import calcul.objet.CaseCarte;
import calcul.objet.Equipement;
import calcul.objet.Perso;
import calcul.objet.decor.Arbre;
import calcul.objet.perso.Link;

public class AnimationZeldo extends Carte
{

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	private ArrayList<Perso> listPerso = new ArrayList<Perso>();
	private ArrayList<CaseCarte> listCase = new ArrayList<CaseCarte>();

	private Carte carte;

	private Hashtable<String, CaseCarte> listeCase = new Hashtable<String, CaseCarte>();
	private Hashtable<String, Perso> listePerso = new Hashtable<String, Perso>();

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
		listPerso.add(MainZeldo.link);

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

	public ArrayList<CaseCarte> getListCase()
	{
		return listCase;
	}

	public Hashtable<String,CaseCarte> getListeCaseCarte()
	{
		return listeCase;
	}
	
	public Hashtable<String,Perso>getListePerso()
	{
		return listePerso;
	}
	
	
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

//			System.out.println();
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
					g.fillRect(
									caseTemp.getX() * CaseCarte.caseWidth, caseTemp.getY() * CaseCarte.caseHeight,
                            CaseCarte.caseWidth, CaseCarte.caseHeight);
				}
					break;
		
				case "arbre":
				{
					g.setColor(Couleur.Green_1);
					g.fillRect(
									caseTemp.getX() * CaseCarte.caseWidth, caseTemp.getY() * CaseCarte.caseHeight,
                            CaseCarte.caseWidth, CaseCarte.caseHeight);
				}
					break;
					
				case "eau":
				{
					g.setColor(Couleur.Blue_3);
					g.fillRect(
									caseTemp.getX() * CaseCarte.caseWidth, caseTemp.getY() * CaseCarte.caseHeight,
                            CaseCarte.caseWidth, CaseCarte.caseHeight);
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
					caseTemp.getX() * CaseCarte.caseWidth,
					caseTemp.getY() * CaseCarte.caseHeight,
					this
				);
			}
			
		}
		
//		listeCase.clear();
		
//		// case de la carte
//		for (int i = 0; i < 17; i++)
//		{
//			for (int j = 0; j < 13; j++)
//			{
//				CaseCarte caseTemp = carte.getListeCase().get("" + i + " " + j);
//
//			}
//
//		}

		// personnages
		for (int i = 0; i < listPerso.size(); i++)
		{

			if (listPerso.get(i).getType().equals("Link"))
			{

//				g.setColor(listPerso.get(i).getColor());
//

				// passe en bleu la case ciblé par zeldo
				g.setColor(new Color(0,255,255,100));
				g.fillRect
				(
					MainZeldo.link.getCaseDevant().getX()*CaseCarte.caseWidth,
					MainZeldo.link.getCaseDevant().getY()*CaseCarte.caseHeight,
					CaseCarte.caseWidth,
					CaseCarte.caseHeight
				);


				// affichage le personnage
				g.drawImage
				(
					listPerso.get(i).getImage(),
					listPerso.get(i).getPosXAnim(),
					listPerso.get(i).getPosYAnim(),
					this
				);

				// affiche l'equipement du personnage
				for (Equipement equipement:listPerso.get(i).getEquipementArrayList())
				{
					g.drawImage
					(
						equipement.getImg(listPerso.get(i).getDirection(),listPerso.get(i).getPhaseAnim()),
						listPerso.get(i).getPosXAnim() ,
						listPerso.get(i).getPosYAnim(),
						this
					);

				}


			}

		}

	}

}
