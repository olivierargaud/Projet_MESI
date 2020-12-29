package calcul.objet;

public class PositionCarte
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private int posX = 0;
	private int posY = 0;

	private String posText = "0 0";

	private String typeCarte = "";

	private String nomCarte = "";

	private boolean teleport = false;

	private Coord coordTeleport = new Coord();

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public PositionCarte()
	{

	}

	public PositionCarte(int posX, int posY)
	{
		this.posX = posX;
		this.posY = posY;
	}

	public PositionCarte(int posX, int posY, String typeCarte, String nomCarte)
	{
		this.posX = posX;
		this.posY = posY;
		this.typeCarte = typeCarte;
		this.nomCarte = nomCarte;

	}

	public PositionCarte(
					int posX,
					int posY,
					String typeCarte,
					String nomCarte,
					boolean teleport,
					Coord coordTeleport)
	{
		this.posX = posX;
		this.posY = posY;
		this.typeCarte = typeCarte;
		this.nomCarte = nomCarte;
		this.teleport = teleport;
		this.coordTeleport = coordTeleport;
	}

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

	public String getPositionText()
	{
		posText = "" + typeCarte + " " + nomCarte +" "+ posX + " " + posY;

		return posText;
	}

	public String getTypeCarte()
	{
		return typeCarte;
	}

	public String getNomCarte()
	{
		return nomCarte;
	}

	public boolean getTeleport()
	{
		return teleport;
	}
	
	public Coord getCoordTeleport()
	{
		return coordTeleport;
	}
	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------SETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void setPosX(int posX)
	{
		this.posX = posX;
	}

	public void setPosY(int posY)
	{
		this.posY = posY;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

}