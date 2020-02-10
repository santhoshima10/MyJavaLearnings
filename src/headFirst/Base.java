package headFirst;

public class Base {

    public int x;

    public Base(){
        this.x = 10;
        System.out.println("Base Constructor");
    }

    public Base(int x){
        System.out.println("Base Constructor with args");
        this.x = x;

    }
}
