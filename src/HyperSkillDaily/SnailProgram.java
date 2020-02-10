package HyperSkillDaily;

import java.util.Scanner;

public class SnailProgram {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int feetInDay = scanner.nextInt();
        int feetinNight = scanner.nextInt();
        int dayCount = 0;
        while(height >= 0){
            if(height - feetInDay <= 0) {
                dayCount++;
                break;
            }
            else{
                height = (height - feetInDay) + feetinNight;
                dayCount++;
            }
        }
        System.out.println(dayCount);

    }
}
