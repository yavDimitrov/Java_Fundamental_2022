package LE9_DataTypes_Variables;

import java.util.Scanner;

public class pokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        int M = Integer.parseInt(scan.nextLine());
        int Y = Integer.parseInt(scan.nextLine());
        int targets = 0;

        double halfN = N * 0.5;

        while (N >= M) {
            N -= M;
            targets++;
            if (N == halfN && Y != 0) {
                N /= Y;

            }
        }
        System.out.println(N);
        System.out.println(targets);

    }
}
