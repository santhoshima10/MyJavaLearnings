package CodeGym;

public class TestEnum {

    public static void main(String[] args){
        Directions mydir = Directions.EAST;
        for(Directions a : Directions.values()){
            System.out.println(a);
        }
        System.out.println(mydir.getAngle());
    }
}
