package LE5_Syntax_CondState_Loops;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int personsCount = Integer.parseInt(scan.nextLine());
        String typeGroup = scan.nextLine();
        String day = scan.nextLine();
        double price = 0.0;
        double totalPrice = 0.0;


        if (typeGroup.equals("Students")) {
            if (day.equals("Friday")) {
                price = 8.45;
            } else if (day.equals("Saturday")) {
                price = 9.80;
            } else if (day.equals("Sunday")) {
                price = 10.46;
            }
            if (personsCount >= 30) {
                totalPrice = price * personsCount * 0.85;
            } else {
                totalPrice = price * personsCount;

            }
        } else if (typeGroup.equals("Business")) {
            if (day.equals("Friday")) {
                price = 10.90;
            } else if (day.equals("Saturday")) {
                price = 15.60;
            } else if (day.equals("Sunday")) {
                price = 16;
            }
            if (personsCount >= 100) {
                totalPrice = price * (personsCount - 10);
            } else {
                totalPrice = price * personsCount;

            }
        } else if (typeGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                price = 15;
            } else if (day.equals("Saturday")) {
                price = 20;
            } else if (day.equals("Sunday")) {
                price = 22.50;
            }
            if (personsCount >= 10 && personsCount <= 20) {
                totalPrice = price * personsCount * 0.95;
            } else {
                totalPrice = price * personsCount;

            }
        }
        System.out.printf("Total price: %.02f", totalPrice);

    }
}
