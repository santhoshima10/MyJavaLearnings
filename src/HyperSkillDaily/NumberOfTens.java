package HyperSkillDaily;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberOfTens {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       /* String inputNumber = scanner.nextLine();
        if(inputNumber.length() > 1){
            System.out.println(inputNumber.charAt(inputNumber.length()-2));
        }*/


       //Camel Case problem from HackerRank Challenge
     /*  String input = scanner.nextLine();
       char[] charArray = input.toCharArray();

        int startIndex = 0;
        int endIndex = 0;
        int wordcount = 0;
       for(int i = 0; i < charArray.length; i++){

           if(Character.isUpperCase(charArray[i])){
               endIndex = i;
               System.out.println(input.substring(startIndex,endIndex));
               startIndex = endIndex;
               wordcount++;
           }

       }
        System.out.println(input.substring(startIndex));
       wordcount++;
        System.out.println(wordcount);
*/


     //Hackerrank Mars exploration problem

     //sample input - SOSOOSOSOSOSOSSOSOSOSOSOSOS
        int count = 0;
        int changeCount = 0;
        String SOSInput = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";

        System.out.println(SOSInput.length());
        int start = 0;
        int end = 3;

        while (end <= SOSInput.length()){

            String substring = SOSInput.substring(start,end);
            if(!"SOS".equals(substring)){
               // System.out.println(SOSInput.substring(start,end));
                if(substring.charAt(0) != 'S'){
                    changeCount++;
                }
                if(substring.charAt(1) != 'O'){
                    changeCount++;
                }
                if(substring.charAt(2) != 'S'){
                    changeCount++;
                }
            }
            start = end;
            end = end+3;
        }
        System.out.println(changeCount);



    }
}
