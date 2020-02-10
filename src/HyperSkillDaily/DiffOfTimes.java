package HyperSkillDaily;

import java.util.Scanner;

public class DiffOfTimes {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] inputValues = new int[6];

        int firstInput =0;
        int secondInput = 0;
        int count = 0;

        while (count <= 5){
           // System.out.println(scanner.nextInt());
            inputValues[count] = scanner.nextInt();
            count++;
        }

        firstInput = inputValues[0] * 60 * 60 + inputValues[1] * 60 + inputValues[2];
        secondInput = inputValues[3] * 60 * 60 + inputValues[4] * 60 + inputValues[5];

        System.out.println(secondInput - firstInput);


    }
}
