package HyperSkillDaily;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String rotation = scanner.nextLine();
        System.out.println("Start Time"+System.currentTimeMillis());
       // System.out.println(array);
       // System.out.println(rotation);
        String[] inputArray = array.split(" ");
        String[] outputArray = new String[inputArray.length];
        int j =0;

        int rotationModified = Integer.parseInt(rotation) % inputArray.length;


       //  displayArray(inputArray);

        for (int rotationCount = 0; rotationCount < rotationModified; rotationCount++) {
            for (int i = 0 ; i < inputArray.length;i++) {
                if(i == 0) {
                    outputArray[j] = inputArray[inputArray.length-1];
                }
                else
                {
                        outputArray[j] = inputArray[i-1];

                }

                 j++;

            }

          //  displayArray(outputArray);
           // System.out.println();
            j=0;
            inputArray = outputArray.clone();
          //  System.out.println("After swapping");
            //displayArray(inputArray);

        }

        displayArray(inputArray);
        System.out.println("End Time"+System.currentTimeMillis());

    }

    public static void displayArray(String[] arr){
        for(int k = 0 ; k < arr.length;k++){
            System.out.print(arr[k]+ " ");

        }

    }
}
