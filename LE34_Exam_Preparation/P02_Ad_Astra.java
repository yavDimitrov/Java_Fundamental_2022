package LE34_Exam_Preparation;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Ad_Astra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Pattern pattern = Pattern.compile("([|#]){1}(?<name>[a-zA-Z\\s]+)\\1(?<data>[\\d]{2}[\\/]{1}[\\d]{2}[\\/][\\d]{2})\\1(?<calories>[\\d]{1,5})\\1");
        Matcher matcher = pattern.matcher(scan.nextLine());
        List<Food> foods = new LinkedList<>();

        while (matcher.find()) {
            String productName = matcher.group("name");
            String data = matcher.group("data");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food curFood = new Food(productName, data, calories);
            foods.add(curFood);

            // System.out.println(productName + " " + data + " " + calories);

        }
        int days = foods.stream().mapToInt(Food::getCalories).sum() / 2000;

        System.out.printf("You have food to last you for: %d days!%n", days);
        foods.forEach(el -> System.out.println(el.asd()));
    }

        static class Food {

            String productName;
            String data;
            int calories;

            public Food(String productName, String data, int calories) {
                this.productName = productName;
                this.data = data;
                this.calories = calories;
            }

            public String getProductName() {
                return productName;
            }

            public void setProductName(String productName) {
                this.productName = productName;
            }

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public int getCalories() {
                return calories;
            }

            public void setCalories(int calories) {
                this.calories = calories;
            }

            public String asd() {
                return String.format("Item: %s, Best before: %s, Nutrition: %d", this.productName, this.data, this.calories);
            }
        }
    }

