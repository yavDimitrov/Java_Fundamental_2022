package LE15_Methods_Exercises;

public class methodDemo {
    public static void main(String[] args) {
        String name = "Peter";
        int age = 25;

        String data = parsePersonalData(name, age);
        System.out.println(data);


    }
    private static String parsePersonalData (String name, int age){
        String result = "";
        result = String.format("Name is: %s%nAge is: %s", name, age);
        return result;

    }

    private static void print() {
        System.out.println("-----------");
    }
}
