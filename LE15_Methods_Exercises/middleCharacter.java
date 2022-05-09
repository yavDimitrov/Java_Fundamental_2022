package LE15_Methods_Exercises;

import java.util.Scanner;

public class middleCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        printMiddleChar(text);
    }
    public static void printMiddleChar(String text){
        if(text.length()%2 == 0){

            System.out.print(text.charAt((text.length()/2)-1) );
            System.out.print(text.charAt(text.length()/2));
        } else {
            System.out.println(text.charAt(text.length()/2));
        }
    }
}
