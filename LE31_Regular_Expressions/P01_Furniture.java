package LE31_Regular_Expressions;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P01_Furniture {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String line = scan.nextLine();
        Pattern patt = Pattern.compile("[>]{2}(?<name>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)");

        List<String> purchases = new LinkedList<>();
        double totalMoney = 0;


        while (!line.equals("Purchase")) {
            Matcher match = patt.matcher(line);
            while (match.find()) {
                String name = match.group("name");
                Double price = Double.parseDouble(match.group("price"));
                Double quantity = Double.parseDouble(match.group("quantity"));
                purchases.add(name);
                totalMoney += price * quantity;
            }

            line = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        purchases.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalMoney);
            }
}
