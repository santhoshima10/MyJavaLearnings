package headFirst;

import java.util.Objects;
import java.util.Observable;
import java.util.Scanner;
import java.util.regex.*;


public class regex {

    public static void main(String[] args){
      //  Pattern p = Pattern.compile("[\\d+\\s+[+-]+\\s+\\d+]*");
      /*  Pattern p = Pattern.compile("(\\d+)(\\s)*[+-]+(\\s)*(\\d+)((\\s)*[+-]+(\\s)*(\\d+))*");
        Matcher m = p.matcher("12 + ");
        System.out.println(m.matches());*/

       // It can start with just a number
       // It can be a number operator number


      // the variable name should be a alphabet or combination of alphabet followed by equal sign and then value

        // the value of the assignment can be integer or a alphabet

        String a = new String("Hello");
        String b = new String("Hello");
        if(a == b){
            System.out.println("equals");
        }
        else{
            System.out.println("Not equals");
        }

    }
}
