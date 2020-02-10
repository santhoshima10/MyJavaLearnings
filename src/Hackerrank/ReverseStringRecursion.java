package Hackerrank;

public class ReverseStringRecursion {

    public static String reverse(String input){
        if(input.isEmpty()){
            return input;
        }
        else{
            return reverse(input.substring(1) )+ input.charAt(0);
        }
    }

    public static void main(String[] args){
        System.out.println(reverse("Hello"));

        StringBuilder builder = new StringBuilder("Hello");
        System.out.println(builder.reverse().toString());

        int[] test = {1,2,23,32,33};

        printArray(test, test.length-1);

    }

    //recursion to printOut the array elements

    public static void printArray(int[] input, int index){
      if(index <= 0){
          System.out.println(input[0]);
      }
      else{
          System.out.println(input[index]);
          printArray(input, index-1);
      }
    }
}
