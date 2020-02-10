package CodeGym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Shuffed {

    public static void main(String[] args){

        ArrayList<String> inputList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1 ; i <= n ; i++){
            inputList.add(scanner.nextLine());
        }

        for(String a : inputList){
            System.out.println(a);
        }

        System.out.println("-----------------");

        for(int j = 0; j < m ; j++){
            System.out.println("add"+inputList.get(j));
            inputList.add(inputList.get(j));
            //inputList.remove(j);
        }

        for(int j = 0; j < m ; j++){
            System.out.println("remove"+inputList.get(j));
           // inputList.add(inputList.get(j));
            inputList.remove(j);
        }

        System.out.println("-----------------");

        for(String a : inputList){
            System.out.println(a);
        }



    }
}
