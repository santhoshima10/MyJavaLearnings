import java.util.Scanner;

public class Sum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //System.out.print(input);
        int sum = 0;
        for(String a :input.split(" "))
        {
           // System.out.print(a);
            sum = sum +Integer.parseInt(a);

        }
        System.out.println(sum);
        scanner.close();
    }
}
