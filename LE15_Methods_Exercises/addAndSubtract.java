package LE15_Methods_Exercises;

import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println(output(numbers));

    }

    public static int output(int[] numbers) {
        int calc = numbers[0] + numbers[1] - numbers[2];
        return calc;
    }
}
