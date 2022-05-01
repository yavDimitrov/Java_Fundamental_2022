package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        double sumMoney = 0.0;
        double money;

        while (!input.equals("Start")){
            money = Double.parseDouble(input);
            if(money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                sumMoney += money;
            } else {
                System.out.printf("Cannot accept %.02f\n", money);
            }

            //System.out.println(sumMoney);
            input = scan.nextLine();


        }
        input = scan.nextLine();

        while(!input.equals("End")){
            if(input.equals("Nuts")){
                if (sumMoney >= 2.0){
                    sumMoney -= 2.0;
                    System.out.println("Purchased Nuts");
                    input = scan.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = scan.nextLine();
                }

            } else if (input.equals("Water")){
                if (sumMoney >= 0.7){
                    sumMoney -= 0.7;
                    System.out.println("Purchased Water");
                    input = scan.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = scan.nextLine();
                }
            } else if (input.equals("Crisps")){
                if (sumMoney >= 1.5){
                    sumMoney -= 1.5;
                    System.out.println("Purchased Crisps");
                    input = scan.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = scan.nextLine();

                }
            } else if (input.equals("Soda")){
                if (sumMoney >= 0.8){
                    sumMoney -= 0.8;
                    System.out.println("Purchased Soda");
                    input = scan.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = scan.nextLine();
                }
            } else if (input.equals("Coke")){
                if (sumMoney >= 1.0){
                    sumMoney -= 1.0;
                    System.out.println("Purchased Coke");
                    input = scan.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = scan.nextLine();
                }
            } else {
                System.out.println("Invalid product");
                input = scan.nextLine();
            }
        }

        System.out.printf("Change: %.02f", sumMoney);
    }
}
