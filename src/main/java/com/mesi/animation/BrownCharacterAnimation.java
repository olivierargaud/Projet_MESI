package com.mesi.animation;

import com.mesi.equipement.*;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class BrownCharacterAnimation extends Animation {

    /**********  Constructors  **********/

    /**
     * Création d'un héros métisse et de son équipement.
     *
     * @throws IOException
     */
    public BrownCharacterAnimation(Hair hair, Head head, Torso torso, Hands hands, Legs legs, Feet feet, RightHand rightHand, LeftHand leftHand) throws IOException {
        super(hair, head, torso, hands, legs, feet, rightHand, leftHand);
        setFileName("src/main/resources/images/sprites/character-brown_skin.png");
        super.createNewCharacter();
    }

    /**********  Methods  **********/

    @Override
    public BufferedImage[] stand(int direction) throws IOException {
        return super.stand(direction);
    }

    @Override
    public BufferedImage[] walkCycle(int direction) throws IOException {
        return super.walkCycle(direction);
    }
}
