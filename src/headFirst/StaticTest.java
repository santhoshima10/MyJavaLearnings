package headFirst;

public class StaticTest extends SuperStatic {
    static int rand;
    static {
        rand = (int)(Math.random()*6);
        System.out.println("Static block "+rand);
    }

    public StaticTest(){
        System.out.println("Constructor !!");
    }

    public static void main(String[] args){
       // StaticTest test = new StaticTest();
        System.out.println(StaticTest.rand);
    }
}
