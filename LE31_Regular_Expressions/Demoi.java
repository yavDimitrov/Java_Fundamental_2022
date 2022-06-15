package LE31_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demoi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String regex = "(?<productName>[a-zA-Z]+)(?<prices>[\\d]+)";
        String text = "Product123" + "Bread45 " + "meat78";

        Pattern patt = Pattern.compile(regex);
        Matcher match = patt.matcher(text);

        while(match.find()){
            System.out.println(match.group(0));
            System.out.println(match.group("productName"));
            System.out.println(match.group("prices"));
        }


    }
}
