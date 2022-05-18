package L21_Objects_and_Classes;

import java.util.Scanner;

public class liveDemo_2 {

    static class Student { //POJO = Plain Old Java Object
        int id;
        String name;
        int age;

    }
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);

        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        a.age = 30;
        a.id = 12345678;
        a.name = "Joro";

        getInfo(a);
        System.out.println();

        b.age = 20;
        b.id = 87654321;
        b.name = "Pesho";

        getInfo(b);

    }

    private static void getInfo(Student a) {
        String sInfo = "ID: " + a.id +  "," + "age: " + a.age + "," + "Name: " + a.name;
        System.out.printf(sInfo);
    }
}
