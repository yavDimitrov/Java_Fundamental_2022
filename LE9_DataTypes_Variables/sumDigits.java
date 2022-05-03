package LE9_DataTypes_Variables;
import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {

            int curNum = Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += curNum ;

         /*   int digit = num % 10;
            sum += digit;
            num /= 10 ; */
       }
        System.out.println(sum);
    }
}
