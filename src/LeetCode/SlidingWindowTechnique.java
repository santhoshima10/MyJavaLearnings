package LeetCode;

public class SlidingWindowTechnique {

    public static void main(String[] args){
        int[] A = {1,9,-1,-2,7,3, -1,2};
        int k = 4;
        char ch = '0';
        int x = ch;
        System.out.println(x);

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

      /*  for(int i = 0;i <A.length -k; i++){
            for(int j = i ; j < i+k ;j++){
                windowSum = windowSum+A[j];
                maxSum = Math.max(maxSum, windowSum);
            }
            windowSum = 0;
        }
        System.out.println(maxSum);*/

        //Sliding window technique;

       /* for(int i = 0 ; i < k ; i++){
            windowSum = windowSum+A[i];
        }


        for(int j = k ; j < A.length; j++){
            maxSum = Math.max(maxSum, windowSum);
            windowSum = windowSum+A[j]-A[j-k];
        }
        System.out.println(maxSum);

       */

        //Another approach

        for(int i = 0; i < A.length; i++){
            windowSum+=A[i];
            if(i >= k-1){
                maxSum = Math.max(maxSum, windowSum);
                windowSum = windowSum-A[i-(k-1)];
            }
        }
        System.out.println(maxSum);
    }







}
