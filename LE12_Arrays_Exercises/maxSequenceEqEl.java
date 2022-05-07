package LE12_Arrays_Exercises;

import java.util.Scanner;

public class maxSequenceEqEl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] num = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }

        int rep = 1;
        int element = 0;
        int repB = 0;
        int elementB = 0;

        for (int i = 1; i < input.length; i++) {
            if(num[i] == num[i-1]){
                rep += 1;
                element = i;
            } else {
                rep = 1;
            }
            if(rep > repB){
                repB = rep;
                elementB = element;
            }
        }
        for (int i = 0; i < repB; i++) {
            System.out.print(num[elementB] + " ");
        }
    }
}
