package LE25_Exercise_Associative_Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DEMO_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Petera", "123456");
        phoneBook.put("Anton", "+35900000");
        phoneBook.containsValue("+35911111");

        phoneBook.remove("Peter");

       phoneBook.entrySet().forEach(entry -> System.out.printf("Name: %s --- Phope: %s%n", entry.getKey(), entry.getValue()));

       phoneBook.forEach((key, value) -> System.out.printf("Name: %s --- Phope: %s%n", key, value));
    }
}
