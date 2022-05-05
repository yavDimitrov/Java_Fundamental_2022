package LE9_DataTypes_Variables;

import java.util.Scanner;

public class waterOver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int tank = 0;

        for (int i = 0; i < n; i++){
            int load = Integer.parseInt(scan.nextLine());
            tank += load;

            if (tank > 255) {
                tank -= load;
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.printf("%d",tank);

    }

}
