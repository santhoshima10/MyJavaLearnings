import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static int min(int a, int b, int c) {
        int minValue=0;
        if((a < b)||(a == b)){
            if(a <= c){
                minValue = a;
            }
        }

        if((b < a)|| (b==a)){
            if(b <= c){
                minValue = b;
            }
        }

        return minValue;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
        System.out.println(min(5, 5, 3));
        System.out.println(2 * (3 + 4) * (5 + 6) * 7);




        for(int i = 1; i<= 10; i++){
            for (int j = 1; j<= 10;j++){
                System.out.print(j*i+" ");
            }
            System.out.print("\n");
        }

        /*Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(x);*/

      /*  InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.print("Enter Name:");
        String name = bufferedReader.readLine();
        System.out.print("Enter years:");
        String years = bufferedReader.readLine();
        System.out.println(name+" will take over the world in "+years+" years. Mwa-ha-ha!");*/

        mul(1);
        mul(2);
        mul(3);
        mul(4);
        mul(5);
        mul(6);
        mul(7);
        mul(8);
        mul(9);
        mul(10);


        while(true){
            int x = System.in.read();
            System.out.println(x);
        }




    }
    public static void mul(int a){
        int i=1;

        while(a < 11 ){
            int table = a*i;
            if(i < 11){
                i++;
            }
            else{
                break;
            }

            System.out.print(table + " ");
        }
        System.out.println("");
    }



}
