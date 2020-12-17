package affichage;

import pojos.Carte;

import java.awt.*;

public class AnimCarte extends Carte
{



//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        offsetX+=strideX;
//        offsetY+=strideY;
//
//        // Carreaux
//        for (int ax = 0; ax < 12; ax++) {
//            for (int ay = 0; ay < 12; ay++) {
//                g.setColor(Color.BLACK);
//                g.drawRect(ax*SIZE, ay*SIZE, SIZE, SIZE);
//            }
//        }
//
//        g.setColor(Color.GREEN.darker().darker());
//        g.fillRect(2*SIZE, 6*SIZE, SIZE/2, SIZE/2);
//
//        System.out.println("Stride : " +strideX+ " / StrideY : " +strideY+ " / OffsetX : " +offsetX+ " / OffsetY : " +offsetY+ " / Direction : " +direction);
//
//        // Personnage
//        try {
//            g.setColor(new Color(0, 0, 0, .5f));
//            g.fillOval(SIZE*originX + SIZE/4 + offsetX, SIZE*(originX+1) - SIZE/5 + offsetY, 32, 16);
//
//            Image img;
//            if (isMovingRight || isMovingLeft || isMovingUp || isMovingDown) {
//                switch (direction) {
//                    case 37:
//                        img = ImageIO.read(new File("res/images/BODY_male-0" + animX + "-01.png"));
//                        break;
//                    case 38:
//                        img = ImageIO.read(new File("res/images/BODY_male-0" + animY + "-00.png"));
//                        break;
//                    case 39:
//                        img = ImageIO.read(new File("res/images/BODY_male-0" + animX + "-03.png"));
//                        break;
//                    default:
//                        img = ImageIO.read(new File("res/images/BODY_male-0" + animY + "-02.png"));
//                }
//            } else {
//                switch (direction) {
//                    case 37:
//                        img = ImageIO.read(new File("res/images/BODY_male-00-01.png"));
//                        break;
//                    case 38:
//                        img = ImageIO.read(new File("res/images/BODY_male-00-00.png"));
//                        break;
//                    case 39:
//                        img = ImageIO.read(new File("res/images/BODY_male-00-03.png"));
//                        break;
//                    default:
//                        img = ImageIO.read(new File("res/images/BODY_male-00-02.png"));
//                }
//            }
//            g.drawImage(img, SIZE * originX + offsetX, SIZE * originY + offsetY, this);
//
//            if (offsetX%16 == 0) animX+=1;
//            if (offsetY%16 == 0) animY+=1;
//            if (animX == 9) animX = 0;
//            if (animY == 9) animY = 2;
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }




}
