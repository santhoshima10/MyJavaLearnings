package CodeGym;
import java.util.*;
import java.io.*;

public class TestCase1 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        HashMap<Character,Integer> mapping = new HashMap<>();
        char[] abcArray = abc.toCharArray();
        for(char c : abcArray){
            mapping.put(c,0);
        }
        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        for(String s : list) {
            char[] charTable = s.toCharArray();
            for(Character c : charTable) {
                if(mapping.containsKey(c)) mapping.put(c, mapping.get(c)+1);
                else mapping.put(c, 1);
            }
        }

        for (Character a : alphabet) {

            System.out.println(a +" "+ mapping.get(a));
          //  System.out.println(entry.getKey() + " " + entry.getValue());
        }
       // System.out.println(alphabet);
    }
}
