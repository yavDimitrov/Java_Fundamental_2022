package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        boolean isDevisible = true;

        if(num % 10 == 0){
            num = 10;
        } else if(num % 7 == 0){
            num = 7;
            }
         else if(num % 6 == 0) {
                num = 6;
            }
         else if(num % 3 == 0) {
                num = 3;
            }
         else if(num % 2 == 0){
            num = 2;
        } else {
             isDevisible = false;
                    }

         if(isDevisible){
             System.out.printf("The number is divisible by %d", num);
         } else {
             System.out.println("Not divisible");
         }

    }
}
