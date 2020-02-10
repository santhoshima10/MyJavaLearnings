import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SmartCalculator {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String t = " ";
        while(!(t = scanner.nextLine()).equals("/exit")) {



            String[] tokens = t.split(" ");
            if(tokens.length >1) {
                if (!isExpressionValid(t)) {
                    System.out.println("Invalid expression");
                } else {
                    int sum = 0;
                    boolean minusFlag = false;
                    for (int i = 0; i < tokens.length; i++) {
                        // System.out.println(tokens[i]);

                        if (isNumeric(tokens[i]) && minusFlag == false) {
                            sum = sum + Integer.parseInt(tokens[i]);
                        } else if (isNumeric(tokens[i]) && minusFlag == true) {
                            sum = sum - Integer.parseInt(tokens[i]);
                            minusFlag = false;
                        } else if (tokens[i].contains("-") && isMathOperator(tokens[i])) {
                            // System.out.println("inside the minus");

                            char[] ch = tokens[i].toCharArray();
                            // System.out.println(ch.length);

                            if (ch.length % 2 == 0) {
                                minusFlag = false;
                            } else {
                                minusFlag = true;
                            }

                        } else if (!isNumeric(tokens[i]) && !isMathOperator(tokens[i])) {
                            System.out.println("Inside for loop Invalid expression");
                        }

                    }


                    System.out.println(sum);

                }
            }
            else if(tokens.length == 1){
                if(isNumeric(tokens[0])) {
                    System.out.println(Integer.parseInt(tokens[0]));
                }
                else if(tokens[0].equals("/help")){
                    System.out.println("The program calculates the sum of numbers");
                }
                else{
                    String newline = System.getProperty("line.seperator");

                    if(tokens[0].contains("/")) {
                        System.out.println("Unknown command");
                    }

                    else if(tokens[0].length() > 1){
                        // System.out.println(tokens[0]);
                        System.out.println("Invalid expression");
                    }
                }
            }

        }
        System.out.println("Bye!");

    }


    public static boolean isNumeric(String input){

        boolean isNumber = false;
        try {
            int num = Integer.parseInt(input);
        }
        catch (NumberFormatException nFe){
            return false;
        }
        return true;


    }

    public static boolean isMathOperator(String operator){

        if(operator.contains("-") || operator.contains("+")){
            return true;
        }
        else {
            return false;
        }

    }

    public static boolean isExpressionValid(String userInput){


            //Pattern p = Pattern.compile("(\\d+)(\\s)*[+-]+(\\s)*(\\d+)((\\s)*[+-]+(\\s)*(\\d+))*");
            Pattern inputPattern = Pattern.compile("^[^\\d].*");

            Matcher matcher = inputPattern.matcher(userInput);
            //System.out.println(matcher.matches());
            return matcher.matches();



    }

    class VariablesProcessor {
        String userInput;

        public VariablesProcessor(String input){
            userInput = input;
        }

        public void validUserInput(){

            char[] charArray = userInput.toCharArray();


        }

    }
}
