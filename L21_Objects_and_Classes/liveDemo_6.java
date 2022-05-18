package L21_Objects_and_Classes;

public class liveDemo_6 {

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
        // Scanner scan =new  Scanner(System.in);

        Circle a = new Circle(5);
        System.out.println(a.getInfo());

        //a.radius = 10;
         a.setRadius(10);
         // a.area = Math.PI* a.radius*a.radius;    i tova trybwa da se updeitne
        System.out.println(a.getInfo());

    }


}
