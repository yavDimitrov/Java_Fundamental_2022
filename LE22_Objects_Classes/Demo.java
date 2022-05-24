package LE22_Objects_Classes;

public class Demo {
    public static void main(String[] args) {
        //Student
        //name -> String
        // average score ->
        Student st1 = new Student();

        st1.name = "Kaloyan";
        st1.averageScore = 5.00;

        System.out.println(st1.getData());
    }
    static class Student {
        String name;
        double averageScore;

        String getData (){
            return String.format("I am %s with avg. score: %.2f", this.name, this.averageScore);
        }
    }
}
