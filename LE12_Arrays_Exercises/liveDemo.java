package LE12_Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class liveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] names = scan.nextLine().split(" ");
    /*    for (int i = 0; i < names.length; i++){
            names [i] = scan.nextLine();
        }
        String text = "SoftUni"; */


        // numbers 10 15 20 25 30
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt( e -> Integer.parseInt(e)).toArray();


        System.out.println();



    }
}
