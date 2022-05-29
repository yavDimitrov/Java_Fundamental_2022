package LE25_Exercise_Associative_Arrays;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DEMO_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, Person> phoneBook = new TreeMap<>();

        Person peter = new Person("Petera", "123456");
        Person anton = new Person("Anton", "+35900000");
        Person sofia = new Person("Sofia", "+35900000");

        phoneBook.put(peter.getName(), peter);
        phoneBook.put(anton.getName(), anton);
        phoneBook.put(sofia.getName(), sofia);

        phoneBook.forEach((key, value) -> System.out.printf("Name: %s --- Phope: %s%n", key, value.phoneNumber));

    }
    public static class Person {
        String name;
        String phoneNumber;
        String email;

        public Person(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }
    }
}
