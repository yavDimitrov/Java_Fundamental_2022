package LE9_DataTypes_Variables;

import java.util.Scanner;

public class sumOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short n = Short.parseShort(scan.nextLine());
        String string ;
        int sum = 0;
        char c;
        for(int i = 0; i < n; i++) {
          /*   string = scan.nextLine();
            c = string.charAt(0); */
            c = scan.nextLine().charAt(0);
            sum += c;

        }
        System.out.printf("The sum equals: %d", sum);

    }
}
