package LE9_DataTypes_Variables;

import java.util.Scanner;

public class PrintPartASCII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());

        for (int i = start; i <= end; i++) {
           // char c = (char)i;
            System.out.printf("%c ", i);
        }
    }
}
