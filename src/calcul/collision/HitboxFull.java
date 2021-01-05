package calcul.collision;

import calcul.objet.CaseCarte;

public class HitboxFull extends HitBox
{
    public HitboxFull()
    {
        setWidth(CaseCarte.caseWidth);
        setHeight(CaseCarte.caseHeight);
        setOrigineX(0);
        setOrigineY(0);
    }

    public HitboxFull(Integer posX, Integer posY)
    {
        setWidth(CaseCarte.caseWidth);
        setHeight(CaseCarte.caseHeight);
        setOrigineX(posX * CaseCarte.caseWidth);
        setOrigineY(posY * CaseCarte.caseHeight);
    }
}
