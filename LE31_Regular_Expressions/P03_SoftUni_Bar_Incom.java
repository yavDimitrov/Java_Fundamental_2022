package LE31_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_SoftUni_Bar_Incom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        Pattern patt = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$.]*?<(?<product>\\w+)>[^|$.]*?\\|(?<count>\\d+)\\|[^|$.]*?(?<price>\\d+\\.?\\d+)\\$");

        double income = 0;
        while(!line.equals("end of shift")){
            Matcher matcher = patt.matcher(line);
            while(matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double currentIncome = count*price;
                income += currentIncome;
                System.out.printf("%s: %s - %.2f%n", name, product, currentIncome);

            }




            line = scan.nextLine();
        }
        System.out.printf("Total income: %.2f", income);

    }
}
