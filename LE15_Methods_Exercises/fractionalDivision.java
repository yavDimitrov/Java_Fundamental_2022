package LE15_Methods_Exercises;

import java.util.Scanner;

public class fractionalDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] nums = new double[2];

        for (int i = 0; i < 2; i++) {
            nums[i] = scan.nextInt();
        }

        double factorielOne = factoriel1(nums);
        double factorielTwo = factoriel2(nums);

        double resultIs = (double)factorielOne / factorielTwo;
        System.out.printf("%.2f", resultIs);
    }

    public static double factoriel1(double nums[]) {
        double fact1;
        if (nums[0] == 0) {
            return 1;
        } else {
            fact1 = 1;
            for (double i = nums[0]; i >= 1; i--) {
                fact1 *= i;
            }
            return fact1;
        }
    }

    public static double factoriel2(double nums[]) {
        double fact2 ;
        if (nums[1] == 0) {
            return 1;
        } else {
            fact2 = 1;
            for (double i = nums[1]; i >= 1; i--) {
                fact2 *= i;
            }
            return fact2;
        }

    }


}

