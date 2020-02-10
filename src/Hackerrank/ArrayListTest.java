package Hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<String>();
        ArrayList<String> testList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= n ; i++){
            String input = scanner.nextLine() ;
            inputList.add(input);
            //System.out.println(input);
        }
        // scanner.nextLine();
        int noQueries = scanner.nextInt();
        scanner.nextLine();
        for(int j = 1; j <= noQueries ; j++){
            String inputQueries = scanner.nextLine() ;
            // System.out.println(inputQueries);

            testList.add(inputQueries);

        }

        for(String inputQuery : testList){

            int index = Integer.parseInt(inputQuery.split(" ")[0]);
            int search = Integer.parseInt(inputQuery.split(" ")[1]);

            //System.out.println(inputList.get(index-1));
            String[] values = inputList.get(index-1).split(" ");
            List<String> valuesList = Arrays.asList(values);
            try{
                System.out.println(valuesList.get(search));
            }

            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
