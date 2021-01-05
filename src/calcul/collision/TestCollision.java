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


    public Boolean isCollisioning(HitBox hitBox, ArrayList<HitBox> boxArrayList,Integer direction )
    {
        Boolean collision = false;

        Rectangle rectangle = new Rectangle(hitBox.getOrigineX(),hitBox.getOrigineY(),hitBox.getWidth(),hitBox.getHeight());

        switch (direction)
        {
            case 0:
            {
                // NORD
                rectangle = new Rectangle(hitBox.getOrigineX(),hitBox.getOrigineY()-4,hitBox.getWidth(),hitBox.getHeight());
                break;
            }
            case 1:
            {
                // OUEST
                rectangle = new Rectangle(hitBox.getOrigineX()-4,hitBox.getOrigineY(),hitBox.getWidth(),hitBox.getHeight());
                break;
            }
            case 2:
            {
                // SUD
                rectangle = new Rectangle(hitBox.getOrigineX(),hitBox.getOrigineY()+4,hitBox.getWidth(),hitBox.getHeight());
                break;
            }
            case 3:
            {
                // EST
                rectangle = new Rectangle(hitBox.getOrigineX()+4,hitBox.getOrigineY(),hitBox.getWidth(),hitBox.getHeight());
                break;
            }
        }

        for (HitBox hit:boxArrayList)
        {
            Rectangle rectangle1 = new Rectangle(hit.getOrigineX(),hit.getOrigineY(),hit.getWidth(),hit.getHeight());

            if(rectangle.intersects(rectangle1))
            {
                collision = true;
            }


//            if
//            (
//                hitBox.getOrigineX() < hit.getOrigineX() + hit.getWidth() &&
//                hitBox.getOrigineX() + hitBox.getWidth() > hit.getOrigineX() &&
//                hitBox.getOrigineY() < hit.getOrigineY() + hit.getHeight() &&
//                hitBox.getHeight() + hitBox.getOrigineY() > hit.getOrigineY()
//            )
//            {
//                collision = true;
//            }
        }

        return collision;
    }

}
