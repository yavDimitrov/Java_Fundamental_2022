package L21_Objects_and_Classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class liveDemo_5 {

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

    static class Circle {
        double radius;
        double area;

        Circle(double rad){
            this.radius = rad;
            this.area = Math.PI*radius*radius;
        }
        String getInfo(){
            return "Circle (R=" + this.radius + ", A=:" + this.area + ")";
        }
        void setRadius (double radius){
            this.radius = radius;
            this.area = Math.PI*radius*radius;
        }

    }
    public static void main(String[] args) {
        // Scanner scan =new  Scanner(System.in);

        Circle a = new Circle(5);
        System.out.println(a.getInfo());

        a.radius = 10;
        // a.setRadius(10);
         // a.area = Math.PI* a.radius*a.radius;    i tova trybwa da se updeitne
        System.out.println(a.getInfo());

    }


}
