package HyperSkillDaily;

import java.util.Scanner;

public class SubstringClass extends Object {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String inputOffset = scanner.nextLine();

        String[] strings = inputOffset.split(" ");

        int startIndex = Integer.parseInt(strings[0]);
        int endIndex =  Integer.parseInt(strings[1]);

        System.out.println(inputString.substring(startIndex,endIndex+1));

    }
}
