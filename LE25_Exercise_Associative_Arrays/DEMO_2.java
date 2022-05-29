package LE25_Exercise_Associative_Arrays;

import java.util.*;

public class DEMO_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, String> phoneBook = new TreeMap<>();
        phoneBook.put("Petera", "123456");
        phoneBook.put("Anton", "+35900000");
        phoneBook.put("Sofia", "+35911111");

        phoneBook.remove("Peter");

        String phoneNumber = phoneBook.get("Peter");

        System.out.println(phoneNumber);
        System.out.println(phoneBook.toString());
    }
}
