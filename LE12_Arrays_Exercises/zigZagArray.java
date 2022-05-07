package LE12_Arrays_Exercises;


import java.util.Scanner;

public class zigZagArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 1; i <= n; i++) {
            String [] line = scan.nextLine().split(" ");
            if (i %2 != 0){
                firstArr [i-1] = line [0];
                secondArr [i-1] = line [1];
            } else {
                firstArr [i-1] = line [1];
                secondArr [i-1] = line [0];
                            }

        }
       /* for (int i = 0; i < n; i++) {
            System.out.print(firstArr[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(secondArr[i] + " ");

        } */
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
