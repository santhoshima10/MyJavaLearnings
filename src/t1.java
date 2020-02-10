import java.io.*;

import java.util.Scanner;


public class t1 {

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        int positiveCnt = 0;
        int negativeCnt = 0;


       if (n1 != 0) {
           if (n1 > 0) {
               positiveCnt++;
           } else {
               negativeCnt++;
           }
       }

       if(n2 != 0) {
           if (n2 > 0) {
               positiveCnt++;
           } else {
               negativeCnt++;
           }
       }


       if(n3 != 0){
           if (n3 > 0){
               positiveCnt++;
           }
           else{
               negativeCnt++;
           }
       }

        System.out.println("Number of negative numbers:"+negativeCnt);
        System.out.println("Number of positive numbers:"+positiveCnt);
    }

    }



