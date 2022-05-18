package L21_Objects_and_Classes;

import java.util.Scanner;

public class liveDemo_3 {

    static class Student { //POJO = Plain Old Java Object
        int id;
        String name;
        int age;

        String getInfo() {
            return "ID: " + this.id +  "," + "age: " + this.age + "," + "Name: " + this.name;
               }

    }
    public static void main(String[] args) {
        Scanner scan =new  Scanner(System.in);

        Student a = new Student();
        Student b = new Student();
        Student c = new Student();

        a.age = 30;
        a.id = 12345678;
        a.name = "Joro";


        System.out.println(a.getInfo());

        b.age = 20;
        b.id = 87654321;
        b.name = "Pesho";

        System.out.println(b.getInfo());

    }


}
