package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_Students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] data = scan.nextLine().split("\\s+");
          Student student = new Student(data[0], data [1], Double.parseDouble(data[2]));
            studentsList.add(student);
        }
        System.out.println();
        studentsList.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));

    }
    //first name (string), last name (string), and grade (a floating-point number).
    static class Student{
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;

        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }

    }
}
