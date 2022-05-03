package LE9_DataTypes_Variables;

import java.util.Scanner;

public class elevatorCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short passangers = Short.parseShort(scan.nextLine());
        short maxPass = Short.parseShort(scan.nextLine());

        int i = (int)Math.ceil((double)passangers / maxPass);
        System.out.println(i);


    }
}
