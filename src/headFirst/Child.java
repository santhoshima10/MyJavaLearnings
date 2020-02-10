package headFirst;

import java.io.Serializable;

public class Child extends Base implements Serializable {

    public int y;

    transient int z;

    public Child(int x, int y){

        super(x);
        this.y = y;
        this.z = 10;
        System.out.println("Inside the constructor");
    }
}
