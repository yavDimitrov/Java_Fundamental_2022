package LE15_Methods_Exercises;

import java.util.Locale;
import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        printVowelsCount(text);
    }
    private static void printVowelsCount (String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.toLowerCase().charAt(i);
            if(symbol == 97 || symbol == 101 || symbol == 105 || symbol == 111 || symbol == 117 || symbol == 121) {
                count++;
            }

        }
        System.out.println(count);
    }
}
