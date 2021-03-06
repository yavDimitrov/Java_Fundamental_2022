package LE15_Methods_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        System.out.println(getSmallestNumber(num1, num2, num3));
    }
    private static int getSmallestNumber(int num1, int num2, int num3) {
        int [] numbers = {num1, num2, num3};
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length/2; i++) {
            int temp = numbers[i];
            numbers [i] = numbers[numbers.length -1 -i];
            numbers [numbers.length-1-i] = temp;

        }

        return numbers[2];
    }
}
