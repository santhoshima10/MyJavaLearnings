import java.math.BigInteger;
import java.util.Scanner;

public class GeekGoddessR21 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String totalTC = scanner.nextLine();
        String testCase = "";
        int totalTCInt = Integer.parseInt(totalTC);
        for(int i = 1; i <= totalTCInt ;i++){
            testCase = scanner.nextLine();
            String[] testCaseArray = testCase.split(" ");
            int round = Integer.parseInt(testCaseArray[0]);
            int successBy = Integer.parseInt(testCaseArray[1]);
            int numberOfOptions = round - successBy;

            //For arya to overall she should win round/2+1...2n
            BigInteger noOfways = new BigInteger("0");
            BigInteger modulo = new BigInteger("1000000007");

            int winningCriteria = round/2+1;
            int startOfPermutation = 1;

            if(numberOfOptions == 0){
                noOfways = new BigInteger("1");
            }
            else {

                 if(numberOfOptions%successBy == 0){

                     for (int j = 1; j <= numberOfOptions; j++) {
                         // System.out.println(j + " " + numberOfOptions);

                         noOfways = noOfways.add(permutation(numberOfOptions, j));
                     }

                 }else{

                     for (int j = 2; j <= numberOfOptions; j++) {
                         // System.out.println(j + " " + numberOfOptions);

                         noOfways = noOfways.add(permutation(numberOfOptions, j));
                     }

                 }


                }

            System.out.println(noOfways.mod(modulo));


            }

        }



    public static BigInteger factorial(int n){
        BigInteger bigInteger = new BigInteger("1");
        for(int i = 1; i<= n ;i++){
            bigInteger = bigInteger.multiply(new BigInteger(i+""));
        }
        return bigInteger;
    }

    public static BigInteger permutation(int n, int r){

        BigInteger n_fact = factorial(n);
        BigInteger r_fact = factorial(r);
        BigInteger nr_fact = factorial(n-r);


        return n_fact.divide(r_fact.multiply(nr_fact));
    }

}
