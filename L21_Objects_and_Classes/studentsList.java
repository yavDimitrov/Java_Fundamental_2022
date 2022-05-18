package L21_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentsList {

    static class Student {
        String firstName;
        String secondName;
        int age;
        String city;

        Student(String firstName, String secondName, int age, String city) {
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.city = city;
        }

        boolean isFrom(String city) {
            return this.city.equals(city);
        }

        String getInfo() {
            return String.format("%s %s is %d years old.", this.firstName, this.secondName, this.age);
        }
        String getFirstName(){
            return this.firstName; // = firstName;
        }
        String getSecondName(){
            return this.secondName; // = secondName;
        }

    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scan = new Scanner(System.in);


        String line = scan.nextLine();

        while (!line.equals("end")) {
            // TODO: read students and add.
            String[] studentParameters = line.split("\\s+");
            String firstName = studentParameters[0];
            String secondName = studentParameters[1];
            int age = Integer.parseInt(studentParameters[2]);
            String city = studentParameters[3];
            // TODO: override if exist

            int index = indexOfStudent(students, firstName, secondName);
            if (index == -1) {
                students.add(new Student(firstName, secondName, age, city));
            } else {
                students.set(index, new Student(firstName, secondName, age, city));
            }

            line = scan.nextLine();
        }

        String city = scan.nextLine();
        // TODO: Print students by city...
        for (Student student : students) {
            if (student.isFrom(city)) {
                System.out.println(student.getInfo());
            }
        }

    }

    private static int indexOfStudent(List<Student> students, String firstName, String lastName) {
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getFirstName().equals(firstName) && s.getSecondName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
