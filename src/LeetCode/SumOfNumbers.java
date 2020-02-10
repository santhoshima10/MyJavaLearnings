package LeetCode;

import java.util.Stack;

public class SumOfNumbers {

    public static  void main(String[] args){
        String num1 = "3876620623801494171";
        String num2 = "6529364523802684779";
        System.out.println(addStrings(num1, num2));

    }

    public static String addStrings(String num1, String num2) {
        int zero_ascii = '0';
        int carry = 0;
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();

        // when lenghth of the input numbers are not same
        if(num1.length()!= num2.length()){
            if(num1.length() > num2.length()){
                int len_diff = num1.length() - num2.length();
                String num2_temp = String.format("%0"+len_diff+"d%s",0 ,num2);
                // System.out.println(num2_temp);
                num2 = num2_temp;

            }
            else{

                int len_diff = num2.length() - num1.length();
                String num1_temp = String.format("%0"+len_diff+"d%s",0 ,num1);
                // System.out.println(num1_temp);
                num1 = num1_temp;

            }
        }

        for(int i = num1.length()-1 ;i >=0 ; i--){
            int num_ascii_1 = num1.charAt(i);
            int num_ascii_2 = num2.charAt(i);

            int num1_digit = num_ascii_1 - zero_ascii;
            int num2_digit = num_ascii_2 - zero_ascii;
            int temp_sum = num1_digit + num2_digit;

            //  System.out.println(temp_sum +":" + carry);

            if(temp_sum >= 10 && i > 0){
                if(carry == 0){
                    carry = 1;
                    stack.push(temp_sum%10);
                }else{
                    temp_sum = temp_sum + carry;
                    stack.push(temp_sum%10);
                    carry =1;
                }
            }
            else{
                //  System.out.println("Sum of Temp in the else"+temp_sum);
                if(carry == 1){
                    temp_sum = temp_sum + carry;
                    //   System.out.println("Sum after carry add"+temp_sum);
                    if(temp_sum >= 10 && i > 0){
                        stack.push(temp_sum%10);
                        carry = 1;
                    }
                    else{
                        stack.push(temp_sum);
                        carry = 0;
                    }

                }
                else{
                    stack.push(temp_sum);
                }
            }

        }

        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }

}
