package calcul.objet.perso;

import calcul.objet.CaseCarte;

public class Squelette extends Perso
{




    public Squelette(int posX,int posY, int direction, String type)
    {

        this.posX = posX;
        this.posY = posY;
        this.direction	= direction;
        this.type		= type;
        this.posXAnim = posX * CaseCarte.caseWidth;
        this.posYAnim = posY * CaseCarte.caseHeight;


    }

}
