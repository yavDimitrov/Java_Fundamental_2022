package LE5_Syntax_CondState_Loops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        int number = num;
        // взимам по 1 нът всяко число от номера
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            // вадим последно число и умножаваме 5!=1*2*3*4*5
            int digit = num % 10;
            int fact = 1;
            // фактуриел на една от цифрите
            for (int j = 1; j <= digit; j++) {
                fact *= j;

            }
            num = num/10;
            sum = sum + fact;
        }

        /*for (int i = 0; i < input.length(); i++) {
           String symbol = "" + input.charAt(i);

         OR

            String symbol = String.valueOf(input.charAt(i));
          */
        if(number == sum ){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
