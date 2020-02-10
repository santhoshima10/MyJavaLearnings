package Hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparable implements Comparator<Integer> {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new TestComparable());
        System.out.println(list);

    }


    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
