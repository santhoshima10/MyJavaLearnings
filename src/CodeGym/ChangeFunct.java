package CodeGym;

import java.util.ArrayList;
import java.util.Scanner;

public class ChangeFunct {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<String>();
        String in = scanner.nextLine();
        while(in != null || !in.isEmpty()){
            inputList.add(in);
            in = scanner.nextLine();
        }

        for(String str : inputList){
            if(str.length()%2 == 0){
                System.out.println(str+" "+str) ;
            }
            else{
                System.out.println(str+" "+str+" "+str) ;
            }
        }

    }
    }

