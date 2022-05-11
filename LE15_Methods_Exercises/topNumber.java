package LE15_Methods_Exercises;

import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        topNumber(n);

    }

    public static void topNumber(int n) {
        for (int i = 1; i <= n; i++) {

            String elements = String.valueOf(i);

            sumOfDigits(elements);


        }

    }

    public static void sumOfDigits(String elements) {
        int[] nums = new int[elements.length()];
        int sum = 0;

        for (int j = 0; j < elements.length(); j++) {
            nums[j] = elements.charAt(j);
            sum += nums[j];
        }
        if (sum % 8 == 0) {
            for (int i = 0; i < elements.length(); i++) {
                if (nums[i] % 2 != 0) {
                    System.out.println(elements);
                    break;
                }
            }

        }

    }
}
