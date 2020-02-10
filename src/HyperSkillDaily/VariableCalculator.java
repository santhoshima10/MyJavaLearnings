package HyperSkillDaily;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VariableCalculator {

    public static HashMap<String,String> assignmentMap = new HashMap<>();

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("/exit")){
          //  System.out.println(input);
            if(input.contains("=")){
                isValidAssignment(input);

            }
            else if(input.contains("+")||input.contains("-")){
                processExpression(input);
            }
            else{
                if(assignmentMap.containsKey(input)) {
                    System.out.println(assignmentMap.get(input));
                }
                else{
                    System.out.println("Unknown variable");
                }
            }

            input = scanner.nextLine();
        }
        System.out.println("Bye!");

    }

    public static boolean isValidAssignment(String input){

        Pattern numericPattern = Pattern.compile("[0-9]*");
        Pattern alphaNumericPattern = Pattern.compile("^[a-zA-Z]*$");
        boolean isValid = false;

        String[] inputCharArr = input.split("=");
        //System.out.println(inputCharArr.length);
         if(inputCharArr.length > 2){
             System.out.println("Invalid assignment");
             isValid = false;
         }
         else{
             String attr1 = inputCharArr[0].trim();
             String attr2 = inputCharArr[1].trim();
             Matcher matcher = alphaNumericPattern.matcher(attr1);
             if(matcher.matches()){
                   Matcher nMatcher = numericPattern.matcher(attr2);
                   if(nMatcher.matches()){
                       isValid = true;
                       storeAssignment(attr1,attr2);
                   }
                   else{
                       matcher = alphaNumericPattern.matcher(attr2);
                       if(matcher.matches()){
                           isValid = true;
                           storeAssignment(attr1,attr2);
                       }
                       else{
                           System.out.println("Invalid assignment");
                           isValid = false;
                       }
                   }
             }
             else{
                 System.out.println("Invalid identifier");
                 isValid = false;
             }


         }
         return  isValid;

    }

    public static void storeAssignment(String key, String value){
        Pattern alphaNumericPattern = Pattern.compile("[a-zA-Z]+");
        Matcher aMatcher = alphaNumericPattern.matcher(value);
        if(aMatcher.matches()){
           String newValue = assignmentMap.get(value);
            assignmentMap.put(key, newValue);
        }
        else {
            assignmentMap.put(key, value);
        }
    }

    public static int processExpression(String input){

         //infix to postfix expr conversion
        //process the post fix expr
        int expr_result = 0;
        String expr = expressionConversion(input);
      //  System.out.println(expr);
        if(expr != null){
            String infixToPostFixExpr = infixToPostFix(expr);
          //  System.out.println(infixToPostFixExpr);
            if(infixToPostFixExpr!=null){
                expr_result = calculatePostFixExpr(infixToPostFixExpr);
                System.out.println(expr_result);
            }
        }
        //System.out.println(expressionConversion(input));
        //System.out.println(infixToPostFix(input));
        //calculatePostFixExpr(input);
        return expr_result;

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

    //converts the variable expr to numeric expr
    public static String expressionConversion(String inputVariableStr){

        StringBuilder sb = new StringBuilder();

        String[] variableArray = inputVariableStr.split(" ");
        for(int i = 0; i < variableArray.length;i++){
            String variable = variableArray[i].trim();
           // System.out.println(variable);
            if(isNumeric(variable)){
                sb.append(variable);
            }
            else {
                if(variable.equals("+")||variable.equals("-") ||variable.equals("*") || variable.equals("/")){
                    sb.append(variable);
                }
                else{
                    if(assignmentMap.containsKey(variable)){
                        sb.append(assignmentMap.get(variable));
                    }
                    else{
                        System.out.println("Unknown variable");
                        sb.setLength(0);
                        break;

                    }
                }

            }
            sb.append(" ");

        }

        return sb.toString();
    }



    public static String infixToPostFix(String inputStr){

        StringBuilder sb = new StringBuilder();
        Stack<String> operatorStack = new Stack<>();
        String[] exprArray = inputStr.split(" ");

        for(int i = 0; i < exprArray.length;i++){
           // System.out.println(exprArray[i]);
            if(isNumeric(exprArray[i])){
                sb.append(exprArray[i]);
            }
            else{
                if(operatorStack.empty()){
                    operatorStack.push(exprArray[i]);
                }
                else{

                    while(!operatorStack.empty()){

                        if( operatorPrecedence(operatorStack.peek().charAt(0)) >= operatorPrecedence(exprArray[i].charAt(0))){

                            sb.append(operatorStack.pop());

                        }
                        else{
                            break;
                        }
                    }
                    operatorStack.push(exprArray[i]);

                }
            }
            sb.append(" ");
        }
        while(!operatorStack.empty()){
            sb.append(operatorStack.pop());
            sb.append(" ");
        }
        return sb.toString();

    }

    private static int operatorPrecedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 0;
            case '*':
            case '/':
                return 1;
            case '^' : return 2;
            default: return -1;
        }
    }

    public static int calculatePostFixExpr(String inputStr){
        int result = 0;
        Stack<Integer> integerStack = new Stack<>();

        String[] numExprArray = inputStr.split(" ");
        for(int i = 0; i < numExprArray.length; i++){
            String num = numExprArray[i];
            if(isNumeric(num)){
                integerStack.push(Integer.parseInt(num));
            }
            else{
                if(num.equals("+")||num.equals("-") ||num.equals("*") || num.equals("/")) {
                    int val1 = integerStack.pop();
                    int val2 = integerStack.pop();
                    switch (num) {
                        case "+":
                            integerStack.push(val2 + val1);
                            break;
                        case "-":
                            integerStack.push(val2 - val1);
                            break;
                        case "*":
                            integerStack.push(val2 * val1);
                            break;
                        case "/":
                            integerStack.push(val2 / val1);
                            break;
                    }
                }
            }
        }
        if(!integerStack.isEmpty()){
            result = integerStack.pop();
        }

        return result;
    }
}
