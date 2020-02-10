package LeetCode;

import java.util.ArrayList;

public class Fibonnacci {

    static  int[] indx = new int[51];

    public static void main(String[] args){
        System.out.println(fibonnacci(40));
        System.out.println(fib(40));

        indx[0] = 0;
        indx[1] = 1;

        for(int i =2 ; i < 51; i++){
            indx[i] = -1;
        }
        System.out.println(fibMemoization(40));
    }

    public static int fibonnacci(int n){
        if(n <= 1){
            return n;
        }
        else{
            return fibonnacci(n-1) +fibonnacci(n-2);
        }
    }

    public static int fib(int n){


        // Iterative for fibonnaci series
        int prev1 = 1;
        int prev2 = 0;
        int sum = 0;
        for(int i = 2; i <= n; i++){
            sum = prev1 + prev2;
            prev2 = prev1;
            prev1 = sum;
        }
        return sum;
    }

    public static int fibMemoization(int n){

        if(indx[n] != -1){
            return  indx[n];
        }
        else{
            indx[n] = fibMemoization(n-1)+fibMemoization(n-2);
            return indx[n];
        }

    }
}
