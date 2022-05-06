package L11_Arrays;

import java.util.Scanner;

public class liveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbersCount = scan.nextInt();
        int [] numbers = new int[numbersCount];


        for ( int i = 0; i < numbers.length; i++){
            numbers [i] = scan.nextInt();
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
