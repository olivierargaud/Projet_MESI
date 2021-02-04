package com.mesi.decor;

import com.mesi.params.Constant;
import com.mesi.params.Images;

import java.awt.*;

public class Tree extends DecorObject {

    public Tree() {
        foregroundOffsetX = -1 * Constant.TILE_SIZE - 1;
        foregroundOffsetY = -3 * Constant.TILE_SIZE;
        backgroundOffsetX = -Constant.TILE_SIZE / 2;
        backgroundOffsetY = 0;

        setBackgroundImage(Images.TRUNK);
        setForegroundImage(Images.FOLIAGE);

        hitbox = new Rectangle(0, 0, Constant.TILE_SIZE, Constant.TILE_SIZE);
    }

    public Tree(Integer tileX, Integer tileY) {
        this();
        setX(tileX * Constant.TILE_SIZE);
        setY(tileY * Constant.TILE_SIZE);
        hitbox = new Rectangle(x, y, Constant.TILE_SIZE, Constant.TILE_SIZE);
    }
}
