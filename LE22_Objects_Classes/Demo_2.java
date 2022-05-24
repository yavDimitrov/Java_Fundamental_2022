package LE22_Objects_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_2 {
    public static void main(String[] args) {
        //Student
        //name -> String
        // average score ->
        Student st1 = new Student();
        Student st2 = new Student("Yavor", 5.60);
        Student st3 = new Student("Peter", 6.0);
        Student st4 = new Student("Ivo", 5.25);
        Student st5 = new Student("Ana", 5.60);

        st1.name = "Kaloyan";
        st1.averageScore = 5.00;

        List<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5));

        // students.forEach(s -> System.out.println(s.getData()));
        students.stream().sorted((s1, s2) -> {
                    int sort = Double.compare(s2.getAverageScore(), s1.getAverageScore());
                    if (sort == 0) {
                        return s1.getName().compareTo(s2.getName());
                    }
                    return sort;
                })
                .forEach(s -> System.out.println(s.toString()));


        //System.out.println(st1.getData());
        //System.out.println(st2.getData());
    }

    static class Student {
        String name;
        double averageScore;


        Student() {

        }

        Student(String name, double averageScore) {
            this.name = name;
            this.averageScore = averageScore;
        }

        public String getName() {
            return name;
        }

        public double getAverageScore() {
            return averageScore;
        }

        String getData() {
            return String.format("I am %s with avg. score: %.2f", this.name, this.averageScore);
        }
    }
}
