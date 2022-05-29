package LE25_Exercise_Associative_Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DEMO_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Petera", "123456");
        phoneBook.put("Peter", "+359987654");
        phoneBook.put("Peter", "+359987654");

        phoneBook.remove("Peter");

        String phoneNumber = phoneBook.get("Peter");

        System.out.println(phoneNumber);
        System.out.println(phoneBook.toString());
    }
}
