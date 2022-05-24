package LE22_Objects_Classes;

import java.util.Random;
import java.util.Scanner;

public class P01_dvertisementMassage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        Messege message = new Messege();
        message.printMessages(n);


    }

    public static class Messege {
        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] event = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] author = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        void printMessages(int messagas) {
            for (int i = 0; i < messagas; i++) {

                // {phrase} {event} {author} – {city}.
                System.out.printf("%s %s %s - %s.%n",
                        this.phrases[random.nextInt(this.phrases.length)],
                        this.event[random.nextInt(this.event.length)],
                        this.author[random.nextInt(this.author.length)],
                        this.city[random.nextInt(this.city.length)]);
            }
        }
    }
}
