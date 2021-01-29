package com.mesi.panels.maps;

import com.mesi.MainZeldo;
import com.mesi.decor.Bush;
import com.mesi.decor.Chest;
import com.mesi.decor.Tree;
import com.mesi.decor.collectableItem.Sword;
import com.mesi.params.Constant;
import com.mesi.params.Hitbox;
import com.mesi.pnj.Pnj;

import java.io.IOException;

/**
 * Paramétrage de l'image de fond, des blocs de collisions et de téléportation de la map.
 * L'initialisation se fait partir de la classe MapGenerator.
 */
public class Map_1 extends MapModel {

    /**********  Constructors  **********/

    public Map_1(Integer width, Integer height, Integer startingPositionX, Integer startingPositionY, Integer startingDirection) throws IOException {
        super(width, height, startingPositionX, startingPositionY, startingDirection);

        setBackgroundURL("res/images/map/forest_background.jpg");
        setForegroundURL("res/images/map/forest_foreground.png");
        setBackgroundImage();
        setForegroundImage();

        setScrollable(true);

        /** Coordonnées des blocs de collision **/
        /** Coordonnées des blocs de collision **/
        getTileList().get("0,15").setTraversable(false);
        getTileList().get("0,19").setTraversable(false);
        getTileList().get("1,14").setTraversable(false);
        getTileList().get("1,16").setTraversable(false);
        getTileList().get("1,18").setTraversable(false);
        getTileList().get("1,20").setTraversable(false);
        getTileList().get("1,30").setTraversable(false);
        getTileList().get("1,34").setTraversable(false);
        getTileList().get("1,36").setTraversable(false);
        getTileList().get("1,38").setTraversable(false);
        getTileList().get("2,13").setTraversable(false);
        getTileList().get("2,17").setTraversable(false);
        getTileList().get("2,21").setTraversable(false);
        getTileList().get("2,29").setTraversable(false);
        getTileList().get("2,31").setTraversable(false);
        getTileList().get("2,33").setTraversable(false);
        getTileList().get("2,35").setTraversable(false);
        getTileList().get("2,37").setTraversable(false);
        getTileList().get("2,39").setTraversable(false);
        getTileList().get("3,12").setTraversable(false);
        getTileList().get("3,22").setTraversable(false);
        getTileList().get("3,28").setTraversable(false);
        getTileList().get("3,32").setTraversable(false);
        getTileList().get("3,40").setTraversable(false);
        getTileList().get("4,9").setTraversable(false);
        getTileList().get("4,11").setTraversable(false);
        getTileList().get("4,21").setTraversable(false);
        getTileList().get("4,23").setTraversable(false);
        getTileList().get("4,27").setTraversable(false);
        getTileList().get("4,37").setTraversable(false);
        getTileList().get("4,39").setTraversable(false);
        getTileList().get("5,8").setTraversable(false);
        getTileList().get("5,10").setTraversable(false);
        getTileList().get("5,12").setTraversable(false);
        getTileList().get("5,24").setTraversable(false);
        getTileList().get("5,26").setTraversable(false);
        getTileList().get("5,30").setTraversable(false);
        getTileList().get("5,40").setTraversable(false);
        getTileList().get("6,7").setTraversable(false);
        getTileList().get("6,23").setTraversable(false);
        getTileList().get("6,25").setTraversable(false);
        getTileList().get("6,30").setTraversable(false);
        getTileList().get("6,34").setTraversable(false);
        getTileList().get("6,39").setTraversable(false);
        getTileList().get("7,6").setTraversable(false);
        getTileList().get("7,24").setTraversable(false);
        getTileList().get("7,34").setTraversable(false);
        getTileList().get("7,40").setTraversable(false);
        getTileList().get("8,5").setTraversable(false);
        getTileList().get("8,17").setTraversable(false);
        getTileList().get("8,23").setTraversable(false);
        getTileList().get("8,25").setTraversable(false);
        getTileList().get("8,34").setTraversable(false);
        getTileList().get("8,39").setTraversable(false);
        getTileList().get("8,41").setTraversable(false);
        getTileList().get("9,4").setTraversable(false);
        getTileList().get("9,11").setTraversable(false);
        getTileList().get("9,24").setTraversable(false);
        getTileList().get("9,42").setTraversable(false);
        getTileList().get("10,5").setTraversable(false);
        getTileList().get("10,12").setTraversable(false);
        getTileList().get("10,23").setTraversable(false);
        getTileList().get("10,25").setTraversable(false);
        getTileList().get("10,32").setTraversable(false);
        getTileList().get("10,41").setTraversable(false);
        getTileList().get("10,43").setTraversable(false);
        getTileList().get("11,4").setTraversable(false);
        getTileList().get("11,24").setTraversable(false);
        getTileList().get("11,44").setTraversable(false);
        getTileList().get("12,5").setTraversable(false);
        getTileList().get("12,9").setTraversable(false);
        getTileList().get("12,25").setTraversable(false);
        getTileList().get("12,43").setTraversable(false);
        getTileList().get("13,4").setTraversable(false);
        getTileList().get("13,24").setTraversable(false);
        getTileList().get("13,42").setTraversable(false);
        getTileList().get("13,44").setTraversable(false);
        getTileList().get("13,46").setTraversable(false);
        getTileList().get("14,5").setTraversable(false);
        getTileList().get("14,11").setTraversable(false);
        getTileList().get("14,41").setTraversable(false);
        getTileList().get("14,43").setTraversable(false);
        getTileList().get("14,45").setTraversable(false);
        getTileList().get("14,47").setTraversable(false);
        getTileList().get("15,6").setTraversable(false);
        getTileList().get("15,19").setTraversable(false);
        getTileList().get("15,42").setTraversable(false);
        getTileList().get("15,48").setTraversable(false);
        getTileList().get("16,7").setTraversable(false);
        getTileList().get("16,12").setTraversable(false);
        getTileList().get("16,13").setTraversable(false);
        getTileList().get("16,14").setTraversable(false);
        getTileList().get("16,21").setTraversable(false);
        getTileList().get("16,47").setTraversable(false);
        getTileList().get("17,6").setTraversable(false);
        getTileList().get("17,12").setTraversable(false);
        getTileList().get("17,14").setTraversable(false);
        getTileList().get("17,24").setTraversable(false);
        getTileList().get("17,36").setTraversable(false);
        getTileList().get("17,46").setTraversable(false);
        getTileList().get("18,7").setTraversable(false);
        getTileList().get("18,12").setTraversable(false);
        getTileList().get("18,14").setTraversable(false);
        getTileList().get("18,25").setTraversable(false);
        getTileList().get("18,31").setTraversable(false);
        getTileList().get("18,45").setTraversable(false);
        getTileList().get("19,6").setTraversable(false);
        getTileList().get("19,12").setTraversable(false);
        getTileList().get("19,13").setTraversable(false);
        getTileList().get("19,14").setTraversable(false);
        getTileList().get("19,15").setTraversable(false);
        getTileList().get("19,24").setTraversable(false);
        getTileList().get("19,44").setTraversable(false);
        getTileList().get("20,7").setTraversable(false);
        getTileList().get("20,8").setTraversable(false);
        getTileList().get("20,9").setTraversable(false);
        getTileList().get("20,15").setTraversable(false);
        getTileList().get("20,25").setTraversable(false);
        getTileList().get("20,45").setTraversable(false);
        getTileList().get("21,8").setTraversable(false);
        getTileList().get("21,9").setTraversable(false);
        getTileList().get("21,11").setTraversable(false);
        getTileList().get("21,24").setTraversable(false);
        getTileList().get("21,27").setTraversable(false);
        getTileList().get("21,42").setTraversable(false);
        getTileList().get("21,44").setTraversable(false);
        getTileList().get("21,46").setTraversable(false);
        getTileList().get("22,9").setTraversable(false);
        getTileList().get("22,11").setTraversable(false);
        getTileList().get("22,25").setTraversable(false);
        getTileList().get("22,43").setTraversable(false);
        getTileList().get("22,45").setTraversable(false);
        getTileList().get("22,47").setTraversable(false);
        getTileList().get("23,10").setTraversable(false);
        getTileList().get("23,16").setTraversable(false);
        getTileList().get("23,21").setTraversable(false);
        getTileList().get("23,24").setTraversable(false);
        getTileList().get("23,28").setTraversable(false);
        getTileList().get("23,30").setTraversable(false);
        getTileList().get("23,32").setTraversable(false);
        getTileList().get("23,42").setTraversable(false);
        getTileList().get("23,44").setTraversable(false);
        getTileList().get("23,48").setTraversable(false);
        getTileList().get("24,9").setTraversable(false);
        getTileList().get("24,14").setTraversable(false);
        getTileList().get("24,25").setTraversable(false);
        getTileList().get("24,27").setTraversable(false);
        getTileList().get("24,29").setTraversable(false);
        getTileList().get("24,31").setTraversable(false);
        getTileList().get("24,47").setTraversable(false);
        getTileList().get("25,10").setTraversable(false);
        getTileList().get("25,24").setTraversable(false);
        getTileList().get("25,32").setTraversable(false);
        getTileList().get("25,48").setTraversable(false);
        getTileList().get("26,11").setTraversable(false);
        getTileList().get("26,13").setTraversable(false);
        getTileList().get("26,23").setTraversable(false);
        getTileList().get("26,27").setTraversable(false);
        getTileList().get("26,47").setTraversable(false);
        getTileList().get("27,12").setTraversable(false);
        getTileList().get("27,14").setTraversable(false);
        getTileList().get("27,24").setTraversable(false);
        getTileList().get("27,48").setTraversable(false);
        getTileList().get("28,15").setTraversable(false);
        getTileList().get("28,17").setTraversable(false);
        getTileList().get("28,21").setTraversable(false);
        getTileList().get("28,23").setTraversable(false);
        getTileList().get("28,43").setTraversable(false);
        getTileList().get("28,49").setTraversable(false);
        getTileList().get("29,16").setTraversable(false);
        getTileList().get("29,18").setTraversable(false);
        getTileList().get("29,20").setTraversable(false);
        getTileList().get("29,22").setTraversable(false);
        getTileList().get("29,24").setTraversable(false);
        getTileList().get("29,44").setTraversable(false);
        getTileList().get("29,46").setTraversable(false);
        getTileList().get("29,48").setTraversable(false);
        getTileList().get("30,19").setTraversable(false);
        getTileList().get("30,21").setTraversable(false);
        getTileList().get("30,30").setTraversable(false);
        getTileList().get("30,36").setTraversable(false);
        getTileList().get("30,45").setTraversable(false);
        getTileList().get("30,47").setTraversable(false);
        getTileList().get("31,20").setTraversable(false);
        getTileList().get("31,24").setTraversable(false);
        getTileList().get("31,37").setTraversable(false);
        getTileList().get("31,44").setTraversable(false);
        getTileList().get("31,46").setTraversable(false);
        getTileList().get("32,17").setTraversable(false);
        getTileList().get("32,19").setTraversable(false);
        getTileList().get("32,21").setTraversable(false);
        getTileList().get("32,35").setTraversable(false);
        getTileList().get("32,47").setTraversable(false);
        getTileList().get("33,16").setTraversable(false);
        getTileList().get("33,18").setTraversable(false);
        getTileList().get("33,48").setTraversable(false);
        getTileList().get("34,11").setTraversable(false);
        getTileList().get("34,13").setTraversable(false);
        getTileList().get("34,15").setTraversable(false);
        getTileList().get("34,19").setTraversable(false);
        getTileList().get("34,47").setTraversable(false);
        getTileList().get("35,10").setTraversable(false);
        getTileList().get("35,12").setTraversable(false);
        getTileList().get("35,14").setTraversable(false);
        getTileList().get("35,16").setTraversable(false);
        getTileList().get("35,48").setTraversable(false);
        getTileList().get("36,9").setTraversable(false);
        getTileList().get("36,42").setTraversable(false);
        getTileList().get("36,47").setTraversable(false);
        getTileList().get("37,10").setTraversable(false);
        getTileList().get("37,14").setTraversable(false);
        getTileList().get("37,48").setTraversable(false);
        getTileList().get("38,9").setTraversable(false);
        getTileList().get("38,37").setTraversable(false);
        getTileList().get("38,47").setTraversable(false);
        getTileList().get("39,8").setTraversable(false);
        getTileList().get("39,13").setTraversable(false);
        getTileList().get("39,24").setTraversable(false);
        getTileList().get("39,32").setTraversable(false);
        getTileList().get("39,48").setTraversable(false);
        getTileList().get("40,7").setTraversable(false);
        getTileList().get("40,18").setTraversable(false);
        getTileList().get("40,45").setTraversable(false);
        getTileList().get("40,47").setTraversable(false);
        getTileList().get("41,6").setTraversable(false);
        getTileList().get("41,23").setTraversable(false);
        getTileList().get("41,46").setTraversable(false);
        getTileList().get("42,5").setTraversable(false);
        getTileList().get("42,8").setTraversable(false);
        getTileList().get("42,35").setTraversable(false);
        getTileList().get("42,45").setTraversable(false);
        getTileList().get("43,6").setTraversable(false);
        getTileList().get("43,14").setTraversable(false);
        getTileList().get("43,15").setTraversable(false);
        getTileList().get("43,16").setTraversable(false);
        getTileList().get("43,17").setTraversable(false);
        getTileList().get("43,34").setTraversable(false);
        getTileList().get("43,36").setTraversable(false);
        getTileList().get("43,38").setTraversable(false);
        getTileList().get("43,42").setTraversable(false);
        getTileList().get("43,44").setTraversable(false);
        getTileList().get("44,5").setTraversable(false);
        getTileList().get("44,13").setTraversable(false);
        getTileList().get("44,17").setTraversable(false);
        getTileList().get("44,23").setTraversable(false);
        getTileList().get("44,35").setTraversable(false);
        getTileList().get("44,37").setTraversable(false);
        getTileList().get("44,39").setTraversable(false);
        getTileList().get("44,43").setTraversable(false);
        getTileList().get("45,6").setTraversable(false);
        getTileList().get("45,11").setTraversable(false);
        getTileList().get("45,12").setTraversable(false);
        getTileList().get("45,17").setTraversable(false);
        getTileList().get("45,34").setTraversable(false);
        getTileList().get("45,36").setTraversable(false);
        getTileList().get("45,40").setTraversable(false);
        getTileList().get("45,42").setTraversable(false);
        getTileList().get("46,5").setTraversable(false);
        getTileList().get("46,10").setTraversable(false);
        getTileList().get("46,16").setTraversable(false);
        getTileList().get("46,35").setTraversable(false);
        getTileList().get("46,37").setTraversable(false);
        getTileList().get("46,39").setTraversable(false);
        getTileList().get("46,41").setTraversable(false);
        getTileList().get("47,6").setTraversable(false);
        getTileList().get("47,10").setTraversable(false);
        getTileList().get("47,15").setTraversable(false);
        getTileList().get("47,38").setTraversable(false);
        getTileList().get("48,5").setTraversable(false);
        getTileList().get("48,10").setTraversable(false);
        getTileList().get("48,15").setTraversable(false);
        getTileList().get("48,39").setTraversable(false);
        getTileList().get("48,41").setTraversable(false);
        getTileList().get("49,6").setTraversable(false);
        getTileList().get("49,9").setTraversable(false);
        getTileList().get("49,15").setTraversable(false);
        getTileList().get("49,38").setTraversable(false);
        getTileList().get("49,40").setTraversable(false);
        getTileList().get("49,42").setTraversable(false);
        getTileList().get("50,5").setTraversable(false);
        getTileList().get("50,9").setTraversable(false);
        getTileList().get("50,16").setTraversable(false);
        getTileList().get("50,17").setTraversable(false);
        getTileList().get("50,18").setTraversable(false);
        getTileList().get("50,28").setTraversable(false);
        getTileList().get("50,31").setTraversable(false);
        getTileList().get("50,32").setTraversable(false);
        getTileList().get("50,33").setTraversable(false);
        getTileList().get("50,43").setTraversable(false);
        getTileList().get("51,6").setTraversable(false);
        getTileList().get("51,9").setTraversable(false);
        getTileList().get("51,18").setTraversable(false);
        getTileList().get("51,29").setTraversable(false);
        getTileList().get("51,30").setTraversable(false);
        getTileList().get("51,34").setTraversable(false);
        getTileList().get("51,42").setTraversable(false);
        getTileList().get("52,5").setTraversable(false);
        getTileList().get("52,8").setTraversable(false);
        getTileList().get("52,9").setTraversable(false);
        getTileList().get("52,13").setTraversable(false);
        getTileList().get("52,18").setTraversable(false);
        getTileList().get("52,28").setTraversable(false);
        getTileList().get("52,34").setTraversable(false);
        getTileList().get("52,43").setTraversable(false);
        getTileList().get("53,6").setTraversable(false);
        getTileList().get("53,10").setTraversable(false);
        getTileList().get("53,11").setTraversable(false);
        getTileList().get("53,12").setTraversable(false);
        getTileList().get("53,14").setTraversable(false);
        getTileList().get("53,18").setTraversable(false);
        getTileList().get("53,24").setTraversable(false);
        getTileList().get("53,25").setTraversable(false);
        getTileList().get("53,26").setTraversable(false);
        getTileList().get("53,27").setTraversable(false);
        getTileList().get("53,34").setTraversable(false);
        getTileList().get("53,44").setTraversable(false);
        getTileList().get("54,7").setTraversable(false);
        getTileList().get("54,9").setTraversable(false);
        getTileList().get("54,13").setTraversable(false);
        getTileList().get("54,15").setTraversable(false);
        getTileList().get("54,16").setTraversable(false);
        getTileList().get("54,17").setTraversable(false);
        getTileList().get("54,24").setTraversable(false);
        getTileList().get("54,35").setTraversable(false);
        getTileList().get("54,43").setTraversable(false);
        getTileList().get("55,8").setTraversable(false);
        getTileList().get("55,22").setTraversable(false);
        getTileList().get("55,23").setTraversable(false);
        getTileList().get("55,36").setTraversable(false);
        getTileList().get("55,44").setTraversable(false);
        getTileList().get("56,7").setTraversable(false);
        getTileList().get("56,9").setTraversable(false);
        getTileList().get("56,21").setTraversable(false);
        getTileList().get("56,35").setTraversable(false);
        getTileList().get("56,37").setTraversable(false);
        getTileList().get("56,40").setTraversable(false);
        getTileList().get("56,45").setTraversable(false);
        getTileList().get("57,6").setTraversable(false);
        getTileList().get("57,20").setTraversable(false);
        getTileList().get("57,37").setTraversable(false);
        getTileList().get("57,44").setTraversable(false);
        getTileList().get("58,7").setTraversable(false);
        getTileList().get("58,20").setTraversable(false);
        getTileList().get("58,31").setTraversable(false);
        getTileList().get("58,32").setTraversable(false);
        getTileList().get("58,37").setTraversable(false);
        getTileList().get("58,43").setTraversable(false);
        getTileList().get("59,8").setTraversable(false);
        getTileList().get("59,20").setTraversable(false);
        getTileList().get("59,30").setTraversable(false);
        getTileList().get("59,33").setTraversable(false);
        getTileList().get("59,37").setTraversable(false);
        getTileList().get("59,44").setTraversable(false);
        getTileList().get("60,7").setTraversable(false);
        getTileList().get("60,9").setTraversable(false);
        getTileList().get("60,19").setTraversable(false);
        getTileList().get("60,31").setTraversable(false);
        getTileList().get("60,34").setTraversable(false);
        getTileList().get("60,35").setTraversable(false);
        getTileList().get("60,36").setTraversable(false);
        getTileList().get("60,45").setTraversable(false);
        getTileList().get("61,6").setTraversable(false);
        getTileList().get("61,8").setTraversable(false);
        getTileList().get("61,15").setTraversable(false);
        getTileList().get("61,19").setTraversable(false);
        getTileList().get("61,31").setTraversable(false);
        getTileList().get("61,44").setTraversable(false);
        getTileList().get("62,5").setTraversable(false);
        getTileList().get("62,19").setTraversable(false);
        getTileList().get("62,25").setTraversable(false);
        getTileList().get("62,32").setTraversable(false);
        getTileList().get("62,43").setTraversable(false);
        getTileList().get("63,6").setTraversable(false);
        getTileList().get("63,19").setTraversable(false);
        getTileList().get("63,24").setTraversable(false);
        getTileList().get("63,26").setTraversable(false);
        getTileList().get("63,29").setTraversable(false);
        getTileList().get("63,31").setTraversable(false);
        getTileList().get("63,42").setTraversable(false);
        getTileList().get("64,7").setTraversable(false);
        getTileList().get("64,9").setTraversable(false);
        getTileList().get("64,11").setTraversable(false);
        getTileList().get("64,19").setTraversable(false);
        getTileList().get("64,20").setTraversable(false);
        getTileList().get("64,24").setTraversable(false);
        getTileList().get("64,26").setTraversable(false);
        getTileList().get("64,27").setTraversable(false);
        getTileList().get("64,28").setTraversable(false);
        getTileList().get("64,33").setTraversable(false);
        getTileList().get("64,43").setTraversable(false);
        getTileList().get("65,6").setTraversable(false);
        getTileList().get("65,10").setTraversable(false);
        getTileList().get("65,21").setTraversable(false);
        getTileList().get("65,22").setTraversable(false);
        getTileList().get("65,23").setTraversable(false);
        getTileList().get("65,40").setTraversable(false);
        getTileList().get("65,42").setTraversable(false);
        getTileList().get("66,7").setTraversable(false);
        getTileList().get("66,9").setTraversable(false);
        getTileList().get("66,28").setTraversable(false);
        getTileList().get("66,39").setTraversable(false);
        getTileList().get("66,41").setTraversable(false);
        getTileList().get("67,8").setTraversable(false);
        getTileList().get("67,10").setTraversable(false);
        getTileList().get("67,40").setTraversable(false);
        getTileList().get("68,9").setTraversable(false);
        getTileList().get("68,15").setTraversable(false);
        getTileList().get("68,37").setTraversable(false);
        getTileList().get("68,41").setTraversable(false);
        getTileList().get("69,8").setTraversable(false);
        getTileList().get("69,38").setTraversable(false);
        getTileList().get("69,40").setTraversable(false);
        getTileList().get("70,7").setTraversable(false);
        getTileList().get("70,37").setTraversable(false);
        getTileList().get("70,41").setTraversable(false);
        getTileList().get("71,6").setTraversable(false);
        getTileList().get("71,14").setTraversable(false);
        getTileList().get("71,30").setTraversable(false);
        getTileList().get("71,36").setTraversable(false);
        getTileList().get("71,38").setTraversable(false);
        getTileList().get("71,40").setTraversable(false);
        getTileList().get("72,5").setTraversable(false);
        getTileList().get("72,9").setTraversable(false);
        getTileList().get("72,35").setTraversable(false);
        getTileList().get("72,39").setTraversable(false);
        getTileList().get("73,6").setTraversable(false);
        getTileList().get("73,10").setTraversable(false);
        getTileList().get("73,40").setTraversable(false);
        getTileList().get("74,7").setTraversable(false);
        getTileList().get("74,31").setTraversable(false);
        getTileList().get("74,39").setTraversable(false);
        getTileList().get("75,8").setTraversable(false);
        getTileList().get("75,34").setTraversable(false);
        getTileList().get("75,40").setTraversable(false);
        getTileList().get("76,9").setTraversable(false);
        getTileList().get("76,39").setTraversable(false);
        getTileList().get("77,10").setTraversable(false);
        getTileList().get("77,36").setTraversable(false);
        getTileList().get("77,38").setTraversable(false);
        getTileList().get("78,11").setTraversable(false);
        getTileList().get("78,31").setTraversable(false);
        getTileList().get("78,33").setTraversable(false);
        getTileList().get("78,35").setTraversable(false);
        getTileList().get("78,37").setTraversable(false);
        getTileList().get("79,12").setTraversable(false);
        getTileList().get("79,16").setTraversable(false);
        getTileList().get("79,26").setTraversable(false);
        getTileList().get("79,34").setTraversable(false);
        getTileList().get("80,11").setTraversable(false);
        getTileList().get("80,31").setTraversable(false);
        getTileList().get("80,33").setTraversable(false);
        getTileList().get("81,10").setTraversable(false);
        getTileList().get("81,32").setTraversable(false);
        getTileList().get("82,9").setTraversable(false);
        getTileList().get("82,27").setTraversable(false);
        getTileList().get("82,31").setTraversable(false);
        getTileList().get("83,10").setTraversable(false);
        getTileList().get("83,23").setTraversable(false);
        getTileList().get("83,28").setTraversable(false);
        getTileList().get("83,30").setTraversable(false);
        getTileList().get("84,9").setTraversable(false);
        getTileList().get("84,27").setTraversable(false);
        getTileList().get("84,29").setTraversable(false);
        getTileList().get("85,10").setTraversable(false);
        getTileList().get("85,16").setTraversable(false);
        getTileList().get("85,28").setTraversable(false);
        getTileList().get("86,9").setTraversable(false);
        getTileList().get("86,27").setTraversable(false);
        getTileList().get("87,10").setTraversable(false);
        getTileList().get("87,28").setTraversable(false);
        getTileList().get("88,11").setTraversable(false);
        getTileList().get("88,27").setTraversable(false);
        getTileList().get("89,12").setTraversable(false);
        getTileList().get("89,28").setTraversable(false);


        /** ajout des buissons **/
        for (int i = 14; i < 17; i++) {
            getDecorObjectArraylist().add(new Bush(i, 24));
        }

        /** ajout des PNJ **/
        Pnj pnjTest = MainZeldo.pnjList.get("pnjTest");
        pnjTest.setCharacterCoordinates(new Integer[]{12 * Constant.TILE_SIZE, 16 * Constant.TILE_SIZE});
        pnjTest.setDirection(1);
        getPnjList().add(pnjTest);

        /** ajout coffre **/
        getDecorObjectArraylist().add(new Chest(13, 16));


        /** ajout épée **/
        getDecorObjectArraylist().add(new Sword(12, 13));

        /** Coordonnées des blocs de téléportation et tuile de destination **/
        addTeleport(getTileList().get("89,15"), true, "MAP_0_1 0,10", Hitbox.EAST_TP);
        addTeleport(getTileList().get("89,16"), true, "MAP_0_1 0,11", Hitbox.EAST_TP);
        addTeleport(getTileList().get("89,17"), true, "MAP_0_1 0,12", Hitbox.EAST_TP);
        addTeleport(getTileList().get("89,18"), true, "MAP_0_1 0,13", Hitbox.EAST_TP);
        addTeleport(getTileList().get("89,19"), true, "MAP_0_1 0,14", Hitbox.EAST_TP);


        addTeleport(getTileList().get("17,14"), true, "MAP_0_0 10,10", Hitbox.NORTH_BORD);
        addTeleport(getTileList().get("18,14"), true, "MAP_0_0 10,10", Hitbox.NORTH_BORD);

    }
}
