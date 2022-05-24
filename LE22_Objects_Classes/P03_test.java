package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P03_test {
    public static void main(String[] args) {


        class Person implements Comparable<Person> {
            public String name;
            public int age;

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            @Override
            public int compareTo(Person p) {
                return this.getName().compareTo(p.getName());
            }
        }


        Scanner scanner = new Scanner(System.in);
        Person person;
        List<Person> personList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            person = new Person(input[0], Integer.parseInt(input[1]));

            if (person.age >= 30) {
                personList.add(person);
            }
        }

        Collections.sort(personList);
        personList.forEach(p -> System.out.printf("%s - %d%n", p.name, p.age));
    }
}


