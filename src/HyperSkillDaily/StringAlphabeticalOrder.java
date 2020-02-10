package HyperSkillDaily;

import java.util.Scanner;


public class StringAlphabeticalOrder {

    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isAlphabetical = true;
        char[] charArray = input.toCharArray();
        for(int i = 0 ; i < charArray.length;i++){

            if(i+1 < charArray.length) {
                int ascii = charArray[i];
                //System.out.println(charArray[i]+" "+ascii);
                int asciiNext = charArray[i + 1];
                //System.out.println(charArray[i + 1]+" "+asciiNext);
                if (ascii > asciiNext) {
                    isAlphabetical = false;
                    break;
                }
            }

        }
        System.out.println(isAlphabetical);

        StringBuffer str = new StringBuffer("polls test");
        str.insert(6,"good");
        System.out.println(str);



    }

}
