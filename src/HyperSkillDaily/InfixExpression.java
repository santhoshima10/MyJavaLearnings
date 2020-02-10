package HyperSkillDaily;

import java.util.Scanner;

public class InfixExpression {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] charArray;
        while (!inputString.equals("/exit")){

            if(inputString.contains("=")){
                String[] inputArray = inputString.split("=");
                boolean result = isValidVariable(inputArray);
                System.out.println(result);

            }
            else {
                charArray = inputString.toCharArray();
                for (char a : charArray) {
                    if (a == ' ' || a == '=') {
                        continue;
                    } else {
                        System.out.println(a);
                    }
                }
            }
            inputString = scanner.nextLine();

        }
    }

    public static boolean isValidVariable(String[] inputs){

        boolean result = true;

        if(!inputs[0].trim().matches("[a-zA-Z]+")){
            result = false;
            System.out.println("Invalid identifier");
        }
        else if(inputs.length != 2){
            result = false;
            System.out.println("Invalid assignment");
        }
        else if(!((inputs[1].trim().length() == 1)||(inputs[1].trim().matches("[0-9]*")))){
            result = false;
            System.out.println("Invalid assignment");
        }
        else{
            result = true;
        }

        return result;

    }
}
