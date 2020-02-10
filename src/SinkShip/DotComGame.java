package SinkShip;

import java.util.Random;
import java.util.Scanner;

public class DotComGame {

    public static void main(String[] args){

        int[] location_cells ;
        int randomNumber = (int) (Math.random() * 3);
        location_cells = new int[]{randomNumber,randomNumber+1,randomNumber+2};

        DotCom dotCom = new DotCom();
        dotCom.setLocationCells(location_cells);
        boolean gameOver = false;
        int guessCount=0;




       while (!gameOver){
           System.out.println("Enter the number :");
           Scanner scanner = new Scanner(System.in);
           String guess = scanner.nextLine();
           String result = dotCom.checkUserGuess(guess);
           System.out.println(result);
           guessCount++;
           if(result.equals("Kill")){
               gameOver = true;
               System.out.println("You took "+guessCount+" guesses");
           }


       }



    }

}
