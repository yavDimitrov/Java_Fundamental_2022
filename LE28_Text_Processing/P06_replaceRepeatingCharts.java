package LE28_Text_Processing;

import java.util.Scanner;

public class P06_replaceRepeatingCharts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        StringBuilder sb = new StringBuilder(scan.nextLine());
        for (int i = 0; i < sb.length()-1; i++) {
            char currentDigit = sb.charAt(i);
            char nextDigit = sb.charAt(i+1);
            if(currentDigit == nextDigit) {
                sb.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(sb);
    }
}
