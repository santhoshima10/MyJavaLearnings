public class Recursion {


    public static void main(String[] args){

        System.out.println(summation(3));

       String a = "he";

    }

    public static int summation(int n){
        //base case
        if( n<=0){
            return 0;
        }
        //  recursive case
        else{
            //3+summation(3-1)
            //3+2+summation(2-1)
            //3+2+1+summation(1-1)
            //3+2+1+0
            return n+summation(n-1);
        }
    }


    public static int factorial(int n){
        if(n <=1){
            return 1;
        }
        else{
            // 3* factorial(3-1)
            //3 * 2 * factorial(2-1)
            // 3* 2*1
            return n * factorial(n-1);
        }
    }


}
