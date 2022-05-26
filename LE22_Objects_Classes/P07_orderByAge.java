package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P07_orderByAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        String line = scan.nextLine();

        while (!line.equals("End")) {
            String[] data = line.split("\\s+");
            Person person = new Person(data[0], data[1], Integer.parseInt(data[2]));
            people.add(person);


            line = scan.nextLine();
        }
        people.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.toString()));

    }

    static class Person {
        String name;
        String ID;
        int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);
        }
    }
}
