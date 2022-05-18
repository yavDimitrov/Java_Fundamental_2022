package L21_Objects_and_Classes;

import java.util.Scanner;

public class liveDemo_4 {

    static class Student { //POJO = Plain Old Java Object
        int id;             // Pole
        String name;
        int age;


        Student (String name, int id, int age){            // Konstruktor
        this.name = name;
        this.id = id;
        this.age = age;

        }

        String getInfo() {          // funkciya
            return "ID: " + this.id +  "," + "age: " + this.age + "," + "Name: " + this.name;
               }

    }
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);

        Student a = new Student("Joro", 12345678, 30);
        Student b = new Student("Pesho", 87654321, 20);
        Student c = new Student("Ivan", 77654321, 27);



        System.out.println(a.getInfo());
        System.out.println(b.getInfo());

    }


}
