package LE15_Methods_Exercises;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char start = scan.nextLine().charAt(0);
        char end = scan.nextLine().charAt(0);

        printInBetween(start, end);
    }
    private static void printInBetween(char start, char end){
        if(start > end){
            char temp = start;
            start = end;
            end = temp;

        }
        for (int i = start +1; i < end; i++) {
            char symbol = (char) i;
            System.out.print(symbol + " " );
        }
    }
}
