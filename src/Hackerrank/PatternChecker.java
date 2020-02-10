package Hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternChecker {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while(testCases>0){
            String pattern = scanner.nextLine();
            try {
                Pattern patternClass = Pattern.compile(pattern);
                System.out.println("Valid");
            }
            catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }

    }
}
