package SinkShip;

public class DotCom {

    int[] locationCells;
    int hitCount;


    public void setLocationCells(int[] gameLocation){
        locationCells = gameLocation;
    }

    public String checkUserGuess(String guessString){
        int guess = Integer.parseInt(guessString);
        String result = "Hit";
        for(int i = 0; i <locationCells.length;i++){
            if(locationCells[i] == guess){
                hitCount = hitCount+1;
                if(hitCount == locationCells.length){
                    result = "Kill";
         }
                else{
                    result = "Hit";
                }
                break;
            }

            else{
                result = "Miss";
            }

        }
        return result;
    }



}
