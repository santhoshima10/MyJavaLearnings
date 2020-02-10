import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;
import java.util.regex.*;

public class GeekGoddessTest {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String testCases = scanner.nextLine();
        int testCasesCnt = Integer.parseInt(testCases);
        String[] input = new String[testCasesCnt];
        for(int i = 0 ; i < testCasesCnt ;i++){
            input[i] = scanner.nextLine();
        }
        for(int j = 0; j < input.length;j++){

           // System.out.println(input[j]);
            Map<String,Integer> map= new LinkedHashMap<>();
            char[] inputSequence = input[j].toCharArray();
            for(char a : inputSequence){
                if( !map.containsKey(Character.toString(a))) {
                    Pattern pattern = Pattern.compile(Character.toString(a));
                    Matcher matcher = pattern.matcher(input[j]);
                    int count = 0;
                    while (matcher.find()) {
                        count++;
                    }
                        map.put(Character.toString(a), count);
                }

            }
         //   System.out.println(map);

            String keyMax = (String)map.keySet().toArray()[0];

            int max = map.get(keyMax) ;

            int temp = map.get(keyMax);
            String key="";
            int value = 0;

            ArrayList<String> maxlist= new ArrayList<>();
            for(Map.Entry mapelement :map.entrySet()){
                 key = (String) mapelement.getKey();
                 value = (int)mapelement.getValue();
                if(value > temp){
                    temp = value;
                    if(temp > max){
                        max = temp;
                        keyMax = key;

                        //maxlist.add(keyMax);
                        //System.out.println(key);
                    }
                }
            }
          //  System.out.println(max);

            for(Map.Entry mapelement :map.entrySet()) {
                if(Objects.equals(max,mapelement.getValue())){
                    maxlist.add((String)mapelement.getKey());
                }
            }



          // System.out.println(maxlist.size());
            if(maxlist.size() == 1){
                System.out.println(maxlist.get(0));
            }
           else {

               System.out.println(Collections.min(maxlist));

            }

        }


    }

}
