package LE28_Text_Processing;

import java.util.Scanner;

public class P04_Ceaser_Ciper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[] input = scan.nextLine().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char symbol : input) {

           //  sb.append(String.format("%c",symbol + 3));
            char c = (char) (symbol + 3);
            sb.append(c);
        }
        System.out.println(sb);
    }
}
