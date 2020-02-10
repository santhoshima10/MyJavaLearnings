package Generics;

public class Generics {

    public static void main(String[] args){
        Integer[] a = new Integer[5];
        String[] b = new String[5];

        for(int i =0; i < a.length;i++){
            a[i] = i;
        }

        for(int i =0; i < b.length;i++){
            b[i] = "Hello "+i;
        }
        printArray(a);
        printArray(b);
        System.out.println(findMax(2,3));
        System.out.println(findMax("hello","Vidhya"));

    }

    public static <T>void printArray(T[] array){
        System.out.print("[");

        for(int j = 0; j< array.length;j++){
            T element =array[j];
            System.out.print(element+" ");
        }
        System.out.println("]");
    }

   public static <T extends Comparable<T>> T findMax(T a, T b){
        int max = a.compareTo(b);
        if(max >=0){
            return a;
        }
        else{
            return b;
        }
   }





}
