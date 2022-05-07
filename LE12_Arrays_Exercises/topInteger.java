package LE12_Arrays_Exercises;

import java.util.Scanner;

public class topInteger {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);

        String [] input = scan.nextLine().split(" ");
        int [] num = new int [input.length];

        for (int i = 0; i < input.length; i++) {
            num [i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < num.length; i++) {
            boolean isTrue = false;
            for (int j = i+1; j < num.length; j++) {

                if (num[i] > num[j]){
                    isTrue = true;
                    continue;
                } else {
                    isTrue = false;
                    break;
                }

            }
              if (isTrue) {
            System.out.print(num[i] + " ");
              }
        }
        System.out.println(num[input.length-1]);
    }
}
