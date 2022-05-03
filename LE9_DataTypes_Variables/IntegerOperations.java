package LE9_DataTypes_Variables;
import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        /*Read four integer numbers. Add first to the second, divide (integer) the sum by the third
        number, and multiply the result by the fourth number. Print the result.
         */
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());
        int num4 = Integer.parseInt(scan.nextLine());

        System.out.println(((num1 + num2)/num3)*num4);

    }
}
