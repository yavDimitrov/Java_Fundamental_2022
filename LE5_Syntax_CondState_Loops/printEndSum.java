package LE5_Syntax_CondState_Loops;

import java.util.Scanner;

public class printEndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int start = Integer.parseInt(scan.nextLine());
        int end = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
            // System.out.print( i + " ");

            if (i == end) {
                System.out.println(i);
                break;

            } else {
                System.out.print(i + " ");
            }
        }
        System.out.printf("Sum: %d", sum);
    }

}



