package LE12_Arrays_Exercises;

import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        int[] num = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        int sumR = 0;
        int sumL = 0;
        boolean isEQ = false;
        for (int i = 0; i < num.length; i++) {

            // Left
            for (int j = 0; j < i; j++) {
                sumL += num[j];
            }
            // Right
            for (int k = i + 1; k < num.length; k++) {
                sumR += num[k];
            }
            if (sumL == sumR) {
                System.out.println(i);
                isEQ = true;
            }
            sumR = 0;
            sumL = 0;
        }
        if (!isEQ) {
            System.out.println("no");
        }
    }
}
