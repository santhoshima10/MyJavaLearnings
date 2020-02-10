package Hackerrank;
import java.util.Scanner;

public class StaticBlock {

    static int B;
    static  int H;
    static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        if(H < 0 || B < 0){
            try {
                throw new Exception("Breadth and height must be positive");
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        else{
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }
}
