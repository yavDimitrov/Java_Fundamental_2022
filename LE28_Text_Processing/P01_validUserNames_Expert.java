package LE28_Text_Processing;

import java.util.Arrays;
import java.util.Scanner;

public class P01_validUserNames_Expert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


       /*  Arrays.stream(scan.nextLine().split(", ")).filter(username -> username.length() >= 3 && username.length() <= 16)
                .filter(username -> username.matches("[a-zA-Z_\\-\\d]+"))
                .forEach(System.out::println); */



        Arrays.stream(scan.nextLine().split(", ")).filter(P01_validUserNames_Expert::isValid)
                .forEach(System.out::println);

    }
    static boolean isValid(String username){
        return username.length() >= 3 && username.length() <= 16 && username.matches("[a-zA-Z_\\-\\d]+");
    }
}
