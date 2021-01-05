package calcul.collision;


import java.awt.*;
import java.util.ArrayList;

public class TestCollision
{


    public TestCollision()
    {

    }


    public Boolean isCollisioning(HitBox hitBox1, HitBox hitBox2)
    {
        Boolean collision = false;

//        var rect1 = {x: 5, y: 5, width: 50, height: 50}
//        var rect2 = {x: 20, y: 10, width: 10, height: 10}
//
//        if (rect1.x < rect2.x + rect2.width &&
//                rect1.x + rect1.width > rect2.x &&
//                rect1.y < rect2.y + rect2.height &&
//                rect1.height + rect1.y > rect2.y) {
//            // collision détectée !
//        }

//        Rectangle rectangle = new Rectangle(0,0,64,64);
//        rectangle.intersects()

        if (hitBox1.getOrigineX() < hitBox2.getOrigineX() + hitBox2.getWidth() &&
                hitBox1.getOrigineX() + hitBox1.getWidth() > hitBox2.getOrigineX() &&
                hitBox1.getOrigineY() < hitBox2.getOrigineY() + hitBox2.getHeight() &&
                hitBox1.getHeight() + hitBox1.getOrigineY() > hitBox2.getOrigineY())
        {
            collision = true;
        }


        return collision;
    }


    public Boolean isCollisioning(HitBox hitBox, ArrayList<HitBox> boxArrayList )
    {
        Boolean collision = false;

        for (HitBox hit:boxArrayList)
        {
            if
            (
                hitBox.getOrigineX() < hit.getOrigineX() + hit.getWidth() &&
                hitBox.getOrigineX() + hitBox.getWidth() > hit.getOrigineX() &&
                hitBox.getOrigineY() < hit.getOrigineY() + hit.getHeight() &&
                hitBox.getHeight() + hitBox.getOrigineY() > hit.getOrigineY()
            )
            {
                collision = true;
            }
        }

        return collision;
    }

}
