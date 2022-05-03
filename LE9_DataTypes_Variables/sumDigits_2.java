package LE9_DataTypes_Variables;

import java.util.Scanner;

public class sumDigits_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int sum = 0;

        while (num != 0) {

            int digit = num % 10;
            sum += digit;
            num /= 10;

        }
        System.out.println(sum);

    }
}
