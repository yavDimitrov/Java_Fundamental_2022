package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double totalPrice = 0.0;

        for(int i = 0; i < n; i++){
            double pricePerCapsul = Double.parseDouble(scan.nextLine());
            int days = Integer.parseInt(scan.nextLine());
            int capsulesCount = Integer.parseInt(scan.nextLine());
            // formula
            double currentOrderPrice = (days * capsulesCount)* pricePerCapsul;
            totalPrice += currentOrderPrice;
            System.out.printf("The price for the coffee is: $%.02f\n", currentOrderPrice);
        }
        System.out.printf("Total: $%.02f", totalPrice);
    }
}
