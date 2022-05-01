package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
The count of students – integer in the range [0…100].
The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
The price of belts for a single belt – the floating-point number in the range [0.00…100.00]. */

        double money = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double saber = Double.parseDouble(scan.nextLine());
        double robes = Double.parseDouble(scan.nextLine());
        double belts = Double.parseDouble(scan.nextLine());

        double saberCount = Math.ceil(students*1.10);
        int beltCount = students - students/6;

        double totalPrice = saber*saberCount + robes*students + beltCount*belts;

        if(money >= totalPrice ){
            System.out.printf("The money is enough - it would cost %.02flv.", totalPrice);
        } else{
            System.out.printf("George Lucas will need %.02flv more.", totalPrice-money);
        }
    }

}
