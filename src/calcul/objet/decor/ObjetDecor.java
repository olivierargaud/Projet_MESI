package calcul.objet.decor;

import calcul.collision.HitBox;

import java.awt.Image;
import java.io.Serializable;


public class ObjetDecor implements Serializable
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	protected String typeObjet = "";

	protected Image img = null;

	protected boolean traversable = false;

	protected boolean deplacable = false;

	protected HitBox hitBox;

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public ObjetDecor()
	{

	}

	public ObjetDecor(HitBox hitBox)
	{
		this.hitBox = hitBox;
	}


// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public String getTypeObjet()
	{
		return typeObjet;
	}

	public Image getImage()
	{
		return img;
	}

	public boolean getTraversable()
	{
		return traversable;
	}

	public boolean getDeplacable()
	{
		return deplacable;
	}

	public HitBox getHitBox()
	{
		return hitBox;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------SETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void setTypeObjet(String typeObjet)
	{
		this.typeObjet = typeObjet;
	}

	public void setImage(Image img)
	{
		this.img = img;
	}

	public void setTraversable(boolean traversable)
	{
		this.traversable = traversable;
	}

	public void setDeplacable(boolean deplacable)
	{
		this.deplacable = deplacable;
	}

	public void setHitBox(HitBox hitBox)
	{
		this.hitBox = hitBox;
	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

}