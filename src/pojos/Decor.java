package pojos;

import java.io.Serializable;

public class Decor implements Serializable
{

    private String type;



    public Decor()
    {

    }

    public Decor(String type)
    {
        this.type = type;
    }





    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }
}
