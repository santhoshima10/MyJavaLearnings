import java.math.BigInteger;
import java.util.Scanner;

public class GeekGoddessR2 {

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
            BigInteger finalResult = new BigInteger("1");
            BigInteger pwer = new BigInteger("2");
            BigInteger modulo = new BigInteger("1000000007");
            BigInteger options = new BigInteger(numberOfOptions+"");

           /* for(int j = 1; j <= round/2 ; j++){
                //n+1
                noOfways = noOfways.add(combination(round,round/2+j));
            }*/


            if(numberOfOptions == 0){
                noOfways = new BigInteger("1");
            }
            else {


               for (int j = 1; j <= numberOfOptions; j++) {

                  // System.out.println("numberOfOptions"+numberOfOptions);
                  // System.out.println("successBy"+successBy);

                    if((j+successBy) >= numberOfOptions) {
                        //System.out.println(j);
                        //n+1
                        noOfways = noOfways.add(combination(numberOfOptions, j));
                    }
                    if(numberOfOptions == 1 && (j+successBy) >= numberOfOptions){
                        noOfways = new BigInteger("2");
                    }
                }


            }



            // System.out.println(noOfways-numberOfOptions);

        /*  if(numberOfOptions == 0){
              //System.out.println(combination(round,round/2));
              noOfways = combination(round, round / 2);
              pwer = pwer.pow(round);
          }
          else {
              noOfways = combination(numberOfOptions, numberOfOptions / 2);
              pwer = pwer.pow(numberOfOptions);

          }

            finalResult = (pwer.subtract(noOfways)).divide(new BigInteger("2"));


            System.out.println(finalResult.mod(modulo).add(options));*/

        System.out.println(noOfways);



        }


    }

    public static BigInteger factorial(int n){
        BigInteger bigInteger = new BigInteger("1");
        for(int i = 1; i<= n ;i++){
            bigInteger = bigInteger.multiply(new BigInteger(i+""));
        }
        return bigInteger;
    }

    public static BigInteger combination(int n, int r){

        BigInteger n_fact = factorial(n);
        BigInteger r_fact = factorial(r);
        BigInteger nr_fact = factorial(n-r);

       // 2^2n - 2nCn/2

        /*System.out.println(n+" "+r);
        System.out.println("Factorial"+factorial(n));
        System.out.println(factorial(r));
        System.out.println(factorial(n-r));
        return 1;*/
        //System.out.println(n_fact.divide(r_fact.multiply(nr_fact)));

        return n_fact.divide(r_fact.multiply(nr_fact));
    }



}
