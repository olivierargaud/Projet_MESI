package calcul.objet;

import java.awt.Color;
import java.util.Hashtable;

import javax.swing.JPanel;

public class Carte extends JPanel
{
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------VARIABLES-----------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	private static final long serialVersionUID = 1L;

	public static final Integer carteHeight = 12;
	public static final Integer carteWidth = 20;

	private Hashtable<String, CaseCarte> listeCase = new Hashtable<String, CaseCarte>();

	private PositionCarte positionCarte = new PositionCarte();

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------CONSTRUCTEUR--------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public Carte()
	{
		setBackground(Color.BLUE);
	}

	public Carte(PositionCarte positionCarte)
	{
		setBackground(Color.BLUE);
		this.positionCarte = positionCarte;

	}

	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------GETTER--------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public Hashtable<String, CaseCarte> getListeCase()
	{
		return listeCase;
	}

	public PositionCarte getPositionCarte()
	{
		return positionCarte;
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

	public void setListeCase(Hashtable<String, CaseCarte> listeCase)
	{
		this.listeCase = listeCase;
	}

	public void setPostionCarte(PositionCarte positionCarte)
	{
		this.positionCarte = positionCarte;
	}
	
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -----------------------------------------------FONCTION------------------------------------------------
	// -------------------------------------------------------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------

	public void modifCase(CaseCarte caseTemp)
	{
		listeCase.replace(caseTemp.getAdresseCase(), caseTemp);
	}

}