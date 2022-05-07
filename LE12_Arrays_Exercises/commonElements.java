package LE12_Arrays_Exercises;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] firstArr = scan.nextLine().split(" ");
        String [] secondArr = scan.nextLine().split(" ");

      /*  for (String secondElement : secondArr) {
            for (String firstElement : firstArr) {
                if(secondElement.equals(firstElement)){
                    System.out.print(secondElement + " ");

            }
        }
        } */

        for( int i = 0; i < secondArr.length; i++){
            String secondelement = secondArr [i];
            for (int j = 0; j < firstArr.length; j++) {
                String firstElement = firstArr [j];
                if(secondelement.equals(firstElement)){
                    System.out.println(firstElement + " ");
                }
            }
        }
    }
}
