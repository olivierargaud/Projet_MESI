package calcul.objet;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import calcul.MainZeldo;
import calcul.objet.decor.Arbre;
import calcul.objet.decor.Coffre;

import javax.imageio.ImageIO;

public class Perso
{

	public static final int NORD = 0;
	public static final int OUEST = 1;
	public static final int SUD = 2;
	public static final int EST = 3;

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	protected int		posX		= 0;
	protected int		posY		= 0;

	protected int		posXAnim		= posX*CaseCarte.caseHeight;
	protected int		posYAnim		= posY* CaseCarte.caseWidth;
	
	protected int	direction	= 2;
	protected int	memoireDirection	= 1;
	
	protected String	type		= "";

	protected int		phaseAnim	= 0;

	protected boolean obstacle = false;
	
	protected boolean deplace = false;
	
	protected Color color = Color.WHITE;
	
	protected CaseCarte caseDevant = null;
	protected CaseCarte caseGauche = null;
	protected CaseCarte caseHaut = null;
	protected CaseCarte caseDroite = null;
	protected CaseCarte caseBas = null;
	
	protected boolean moveGauche = false;
	protected boolean moveHaut = false;
	protected boolean moveDroite = false;
	protected boolean moveBas = false;
	
	
	protected Carte carteActuelle = new Carte();


	protected BufferedImage sprite;
	protected Image img = null;
	
	protected ArrayList<Image>listeAnim = new ArrayList<Image>();

	protected ArrayList<Equipement>equipementArrayList = new ArrayList<>();


	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public Perso()
	{

	}

//	public Perso(int posX, int posY)
//	{
//		this.posX	= posX;
//		this.posY	= posY;
//		this.posXAnim = posX*CaseCarte.caseWidth;
//		this.posYAnim = posY*CaseCarte.caseHeight;
//
//	}
//
//	public Perso(int posX,int posY, int direction, String type,Color color)
//	{
//		this.posX = posX;
//		this.posY = posY;
//		this.direction	= direction;
//		this.type		= type;
//		this.posXAnim = posX*CaseCarte.caseWidth;
//		this.posYAnim = posY*CaseCarte.caseHeight;
//		this.color = color;
//	}
//
//	public Perso(int posX,int posY, int direction,int memoireDirection, String type,Color color)
//	{
//		this.posX = posX;
//		this.posY = posY;
//		this.direction	= direction;
//		this.memoireDirection	= memoireDirection;
//		this.type		= type;
//		this.posXAnim = posX*CaseCarte.caseWidth;
//		this.posYAnim = posY*CaseCarte.caseHeight;
//		this.color = color;
//	}

	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public int getPosX()
	{
		return posX;
	}

	public int getPosY()
	{
		return posY;
	}

	public int getPosXAnim()
	{
		return posXAnim;
	}

	public int getPosYAnim()
	{
		return posYAnim;
	}
	
	public int getDirection()
	{
		return direction;
	}

	public int getMemoireDirection()
	{
		return memoireDirection;
	}

	public String getType()
	{
		return type;
	}

	public int getPhaseAnim()
	{
		return phaseAnim;
	}

	public boolean getObstacle()
	{
		return obstacle;
	}

	public boolean getDeplace()
	{
		return deplace;
	}
	
	public Color getColor()
	{
		return color;
	}
	
	public CaseCarte getCaseDevant()
	{
		switch (direction)
		{
			case NORD:
			{
				caseDevant = getCaseHaut();
				break;
			}
			case OUEST:
			{
				caseDevant = getCaseGauche();
				break;
			}
			case SUD:
			{
				caseDevant = getCaseBas();
				break;
			}
			case EST:
			{
				caseDevant = getCaseDroite();
				break;
			}
		}

		return caseDevant;
	}
	
	public CaseCarte getCaseGauche()
	{
		int tempX = (posXAnim-(CaseCarte.caseWidth/2))/CaseCarte.caseWidth;
		int tempY =( (posYAnim+(CaseCarte.caseHeight/2)) )/CaseCarte.caseHeight;

		caseGauche = carteActuelle.getListeCase().get
		(
			(posXAnim-(CaseCarte.caseWidth/2))/CaseCarte.caseWidth
			+" "
			+( (posYAnim+(CaseCarte.caseHeight/2)) )/CaseCarte.caseHeight
		);
						
		return caseGauche;
	}
	
	public CaseCarte getCaseHaut()
	{
		caseHaut = carteActuelle.getListeCase().get(((posXAnim+(CaseCarte.caseWidth/2))/CaseCarte.caseWidth+" "+((posYAnim-(CaseCarte.caseHeight/2)))/CaseCarte.caseHeight));
		
		return caseHaut;
	}
	
	public CaseCarte getCaseDroite()
	{
		caseDroite = carteActuelle.getListeCase().get(((posXAnim+(CaseCarte.caseWidth/2))/CaseCarte.caseWidth)+1+" "+((posYAnim+(CaseCarte.caseHeight/2)))/CaseCarte.caseHeight);

//		System.out.println("case de droite "+(posX+1)+" "+posY);
//		System.out.println("cette case est traversable "+carteActuelle.getListeCase().get((posX+1)+" "+posY).getTraversable());
//		System.out.println("cette case est traversable "+carteActuelle.getListeCase().get((posX+1)+" "+posY).getType());

		return caseDroite;
	}
	
	public CaseCarte getCaseBas()
	{
//		System.out.println(posXAnim+" "+posYAnim);
//		System.out.println((posXAnim+(CaseCarte.caseWidth/2))/CaseCarte.caseWidth+" "+(((posYAnim+(CaseCarte.caseHeight/2))/CaseCarte.caseHeight)+1));
		int x = (posXAnim+(CaseCarte.caseWidth/2))/CaseCarte.caseWidth;
		int y = ((posYAnim+(CaseCarte.caseHeight/2))/CaseCarte.caseHeight)+1;
		caseBas = carteActuelle.getListeCase().get(((posXAnim+(CaseCarte.caseWidth/2))/CaseCarte.caseWidth+" "+(((posYAnim+(CaseCarte.caseHeight/2))/CaseCarte.caseHeight)+1)));
		
//		System.out.println("case du bas "+posX+" "+(posY+1));
//		System.out.println("cette case est traversable "+carteActuelle.getListeCase().get(posX+" "+(posY+1)).getTraversable());
//		System.out.println("cette case est traversable "+carteActuelle.getListeCase().get(posX+" "+(posY+1)).getType());
		
		return caseBas;
	}
	
	public boolean getMoveGauche()
	{
		int posXATemp = (posXAnim-4)/CaseCarte.caseWidth;
		if(posXAnim-4<0)
		{
			posXATemp -=1;
		}
		int posYATemp = (posYAnim/CaseCarte.caseHeight);
		if(posYAnim<0)
		{
			posXATemp -=1;
		}
		int posXBTemp = (posXAnim-4)/CaseCarte.caseWidth;
		if(posXAnim-4<0)
		{
			posXBTemp -=1;
		}
		int posYBTemp = (posYAnim+CaseCarte.caseHeight-1)/CaseCarte.caseHeight;
		if(posYAnim+CaseCarte.caseHeight-1<0)
		{
			posYBTemp -=1;
		}
		
		moveGauche = carteActuelle.getListeCase().get(posXATemp+" "+posYATemp).getTraversable()
					&& carteActuelle.getListeCase().get(posXBTemp+" "+posYBTemp).getTraversable();
		
		return moveGauche;
	}
	
	public boolean getMoveHaut()
	{
		int posXATemp = posXAnim/CaseCarte.caseWidth;
		if(posXAnim<0)
		{
			posXATemp -=1;
		}
		int posYATemp = (posYAnim-4)/CaseCarte.caseHeight;
		if(posYAnim-4<0)
		{
			posYATemp -=1;
		}
		int posXBTemp = (posXAnim+39)/CaseCarte.caseWidth;
		if(posXAnim+CaseCarte.caseHeight-1<0)
		{
			posXBTemp -=1;
		}
		int posYBTemp = (posYAnim-4)/CaseCarte.caseHeight;
		if(posYAnim-4<0)
		{
			posYBTemp -=1;
		}
		
		moveHaut = carteActuelle.getListeCase().get(posXATemp+" "+posYATemp).getTraversable()
					&& carteActuelle.getListeCase().get(posXBTemp+" "+posYBTemp).getTraversable();
		
		return moveHaut;
	}
	
	public boolean getMoveDroite()
	{
		moveDroite = carteActuelle.getListeCase().get(((posXAnim/CaseCarte.caseWidth)+1)+" "+((posYAnim/CaseCarte.caseHeight))).getTraversable()
					&& carteActuelle.getListeCase().get(((posXAnim/CaseCarte.caseWidth)+1)+" "+(((posYAnim+CaseCarte.caseHeight-1)/CaseCarte.caseHeight))).getTraversable();
		
		return moveDroite;
	}
	
	public boolean getMoveBas()
	{
		moveBas = carteActuelle.getListeCase().get(((posXAnim/CaseCarte.caseWidth))+" "+((posYAnim/CaseCarte.caseHeight)+1)).getTraversable()
					&& carteActuelle.getListeCase().get((((posXAnim+CaseCarte.caseHeight-1)/CaseCarte.caseWidth))+" "+((posYAnim/CaseCarte.caseHeight)+1)).getTraversable();
		
		return moveBas;
	}
	
	public Image getImage()
	{
		img = sprite.getSubimage(64*phaseAnim,64*direction,64,64);

		return img;
	}

	public ArrayList<Image> getListeImage()
	{
		return listeAnim;
	}

	public ArrayList<Equipement> getEquipementArrayList()
	{
		return equipementArrayList;
	}

	public BufferedImage getSprite()
	{
		return sprite;
	}


	
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JPANEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JTEXTFIELD----------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------JLABEL--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

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

	public void setPosX(int posX)
	{
		this.posX = posX;
		this.posXAnim=posX*CaseCarte.caseWidth;
//		this.coord.setX(posX);
	}

	public void setPosY(int posY)
	{
		this.posY = posY;
		this.posYAnim = posY*CaseCarte.caseHeight;
//		this.coord.setY(posY);
	}

	public void setPosXAnim(int posXAnim)
	{
		this.posXAnim = posXAnim;
		this.posX = posXAnim/CaseCarte.caseWidth;
		if (posXAnim<0)
		{
			this.posX = (posXAnim/CaseCarte.caseWidth)-1;
		}
	}

	public void setPosYAnim(int posYAnim)
	{
		this.posYAnim = posYAnim;
		this.posY = posYAnim/CaseCarte.caseHeight;
		if (posYAnim<0)
		{
			this.posY = (posYAnim/CaseCarte.caseHeight)-1;
		}
	}
		
	public void setDirection(int direction)
	{
		this.direction = direction;
	}

	public void setMemoireDirection(int memoireDirection)
	{
		this.memoireDirection = memoireDirection;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public void setPhaseAnim(int phaseAnim)
	{
		this.phaseAnim = phaseAnim;
	}

	public void setObstacle(boolean obstacle)
	{
		this.obstacle = obstacle;
	}
	
	public void setDeplace(boolean deplace)
	{
		this.deplace = deplace;
	}
	
	public void setColor(Color color)
	{
		this.color = color;
	}
	
	public void setCaseDevant(CaseCarte caseDevant)
	{
		this.caseDevant=caseDevant;
	}
	
	public void setImage(Image img)
	{
		this.img = img;
	}

	public void setCarteActuelle(Carte carte)
	{
		this.carteActuelle = carte;
	}

	public void setEquipementArrayList(ArrayList<Equipement> equipementArrayList)
	{
		this.equipementArrayList = equipementArrayList;
	}

	public void setSprite(BufferedImage sprite)
	{
		this.sprite = sprite;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------



	public void planterUnArbre()
	{
		getCaseDevant().setObjetDecor(new Arbre());
	}

	public void couperUnArbre()
	{
		getCaseDevant().setObjetDecor(null);
		getCaseDevant().setTraversable(true);
	}


	public void ouvrirCoffre(Coffre coffre)
	{

		if(coffre.getEquipement()!=null)
		{
			equipementArrayList.add(coffre.getEquipement());
			coffre.setEquipement(null);
			try
			{
				BufferedImage image = ImageIO.read(new File("res/image/coffre_ouvert.png"));
				coffre.setImage(image);
			}
			catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}



		}


	}


	
}
