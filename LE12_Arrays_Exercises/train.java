package LE12_Arrays_Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int wagons = Integer.parseInt(scan.nextLine());
        int[] train = new int [wagons];

        int allPeople = 0;
        for(int i = 0; i < wagons; i ++ ){

            train[i] = Integer.parseInt(scan.nextLine());
            allPeople += train [i];
            System.out.print(train[i] + " ");
        }

        System.out.printf("\n%s", allPeople);


    }
}
