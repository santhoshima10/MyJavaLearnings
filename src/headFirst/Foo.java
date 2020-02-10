package headFirst;

public class Foo {

  /*  public  static final int X;

    static {
        X = 45;
        System.out.println("Static block is called");
    }*/

    {
        System.out.println("Hellloo");
    }

    public static void main(String[] args){
        Foo f = new Foo();
        Foo f1 = new Foo();
        //System.out.println(Foo.X);
    }



}
