package CodeGym;

public enum Directions {
    NORTH(0),
    SOUTH(20),
    EAST(40),
    WEST(50);
    int angle;

     Directions(int inAngel){
        this.angle = inAngel;
    }

    public int getAngle(){
         return this.angle;
    }
}
