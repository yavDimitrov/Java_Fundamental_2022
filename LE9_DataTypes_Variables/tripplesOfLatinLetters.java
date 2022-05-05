package LE9_DataTypes_Variables;

import java.util.Scanner;

public class tripplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = Integer.parseInt(scan.nextLine());

        for( int i = 97; i < 97+index; i++){
            for(int j = 97; j < 97+index; j++){
                for(int k = 97; k < 97+index; k++){
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
