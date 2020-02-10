package Hackerrank;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        StringBuilder builder = new StringBuilder();



        for (int i = inputString.length() - 1; i >= 0; i--) {
            System.out.println(inputString.charAt(i));
            builder.append(inputString.charAt(i));
        }
       String reversedString =  builder.toString();
        if(inputString.equals(reversedString)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }


}
