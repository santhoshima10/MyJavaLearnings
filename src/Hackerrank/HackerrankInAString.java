package Hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HackerrankInAString {

    public static void main(String[] args){
        String input = "hhaacckkekraraannk";
        String checkSting = "hackerrank";
        ArrayList<Character> map = new ArrayList<>();
        for(int i = 0; i < input.length();i++){
            Character ch = input.charAt(i);
            if(input.charAt(i) == 'h'){
             System.out.println(i);
             map.add(ch);
            }
            if(input.charAt(i) == 'a'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'c'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'k'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'e'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'r'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'r'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'a'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'n'){
                System.out.println(i);
                map.add(ch);
            }
            if(input.charAt(i) == 'k'){
                System.out.println(i);
                map.add(ch);
            }



        }
        System.out.println(map);
    }
}
