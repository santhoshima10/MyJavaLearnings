package CodeGym;

import java.util.ArrayList;

public class testArrayList {

    public static void main(String[] args){
        System.out.println(System.currentTimeMillis());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10000 ; i++){
            list.add(i,i);
        }

        for(int i = 0; i < 10000 ; i++){
            list.remove(i);
        }


    }


}
