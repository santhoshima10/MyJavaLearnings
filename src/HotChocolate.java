public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,TooColdException{
        if(cocoaTemp >= tooHot){
            throw new TooHotException();
        }
        else if(cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }


    public static void main(String[] args){

        double hotChocolateTemp = 185;
        boolean rightTemp = true;
        try {
            drinkHotChocolate(hotChocolateTemp);
            System.out.println("Good to Go!!!");
        }
        catch (TooHotException e){
            System.out.println("Tooooooooo Hot to Drink!!!");
        }
        catch (TooColdException e1){
            System.out.println("Too Cold to Drink!!!");
        }


    }
}
