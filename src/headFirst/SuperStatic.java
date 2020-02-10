package headFirst;

public class SuperStatic {

    static int X;
    static {
        X= 10;
        System.out.println("super static block");
    }

    SuperStatic(){
        System.out.println("Super Constructor");
    }

}
