package calcul.objet;

import calcul.objet.decor.ObjetDecor;
import calcul.objet.perso.PNJ;

import javax.swing.JPanel;

public class CaseCarte extends JPanel
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final Integer caseHeight = 64;
	public static final Integer caseWidth = 64;

	private int posX = 0;
	private int posY = 0;
	
	private String adresseCase = "";
	
	private String type = "sol";

	private boolean traversable = true;

	private int passage = 0;

	private String carteDestination = null;
	
	private int posXDestination = 0;
	private int posYDestination = 0;
	
	private ObjetDecor objetDecor = null;

	private PNJ pnj ;
	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public CaseCarte()
	{

	}

	public CaseCarte(int posX,int posY)
	{
		this.posX=posX;
		this.posY=posY;
	}

	public CaseCarte(String type)
	{
		this.type = type;
	}


	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public int getX()
	{
		return posX;
	}
	
	public int getY()
	{
		return posY;
	}
	
	public String getAdresseCase()
	{
		adresseCase = ""+posX+" "+posY;
		
		return adresseCase;
	}
	
	public String getType()
	{
		return type;
	}

	public boolean getTraversable()
	{
		return traversable;
	}

	public int getTypePassage()
	{
		return passage;
	}
	
	public String getCarteDestination()
	{
		return carteDestination;
	}
	
	public int getPosXDestination()
	{
		return posXDestination;
	}
	
	public int getPosYDestination()
	{
		return posYDestination;
	}
	
	public ObjetDecor getObjetDecor()
	{
		return objetDecor;
	}

	public PNJ getPnj()
	{
		return pnj;
	}


	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------SETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void setType(String type)
	{
		this.type = type;
	}

	public void setTraversable(boolean traversable)
	{
		this.traversable = traversable;
	}
	
	public void setTypePassage(int passage)
	{
		this.passage = passage;
	}
	
	public void setDestinationPassage(String carteDestination,int posXDestination , int posYDestination)
	{
	
		this.carteDestination = carteDestination;
		this.posXDestination = posXDestination;
		this.posYDestination = posYDestination;
		
	}
	
	public void setObjetDecor(ObjetDecor objetDecor)
	{
		this.objetDecor = objetDecor;
		if(objetDecor!=null)
		{
			this.traversable = objetDecor.getTraversable();
		}
	}

	public void setPnj(PNJ pnj)
	{
		this.pnj = pnj;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

}
