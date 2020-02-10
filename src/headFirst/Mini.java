package headFirst;

import java.awt.Color;

public class Mini extends Car {

    Color color;

    public Mini(){
        this(Color.RED);
    }

    public Mini(Color c){
        super("Mini");
        color = c;
    }

    public Mini(int size){
        this(Color.RED);
       // super(size);

    }


}
