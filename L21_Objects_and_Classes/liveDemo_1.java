package L21_Objects_and_Classes;

import javax.sql.rowset.JoinRowSet;
import java.util.Scanner;

public class liveDemo_1 {

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

        System.out.println("age: " + a.age);
        System.out.println("ID: " + a.id);
        System.out.println("Name: " + a.name);


        b.age = 20;
        b.id = 87654321;
        b.name = "Pesho";

    }
}
