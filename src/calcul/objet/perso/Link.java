package calcul.objet.perso;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import calcul.MainZeldo;
import calcul.objet.Perso;
import calcul.objet.decor.Arbre;

public class Link extends Perso
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------





	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public Link()
	{

	}
	
	public Link(int posX,int posY, int direction, String type,Color color)
	{
//		initAnim();
		
		this.posX = posX;
		this.posY = posY;	
		this.direction	= direction;
		this.type		= type;
		this.posXAnim = posX*40;
		this.posYAnim = posY*40;
		this.color = color;


	}
	
//	public Link(int posX,int posY, int direction,int memoireDirection, String type,Color color)
//	{
//		initAnim();
//
//		this.posX = posX;
//		this.posY = posY;
//		this.direction	= direction;
//		this.memoireDirection	= memoireDirection;
//		this.type		= type;
//		this.posXAnim = posX*40;
//		this.posYAnim = posY*40;
//		this.color = color;
//	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

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

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------





}