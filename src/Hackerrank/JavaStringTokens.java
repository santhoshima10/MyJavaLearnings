package Hackerrank;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) throws Exception {
      // Scanner scanner = new Scanner(System.in);
    //   String s = scanner.nextLine();
        String s = "He is a very very good boy, isn't he?";
        int tokensCount = 0;
        String replaced = s.replaceAll("[!,?._'@]+"," ");
       // System.out.println(replaced);
       // System.out.println(replaced.split(" ").length);
        for(String a : replaced.split(" ")){
            if(a.length() >= 1 ){
               // System.out.println(a) ;
                tokensCount++;
            }
        }
       // throw new Exception();

        System.out.println(tokensCount);

        for(String a : replaced.split(" ")){
            if(a.length() >= 1 ){
                System.out.println(a) ;
                //tokensCount++;
            }
        }
    }
}
