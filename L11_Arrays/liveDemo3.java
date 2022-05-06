package L11_Arrays;

import java.util.Scanner;

public class liveDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineOfNumbers = scan.nextLine();
        String [] numbersAsStrings = lineOfNumbers.split("\\s+");

        int [] numbers = new int [numbersAsStrings.length];
        for ( int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

            for ( int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");


        }
    }
}
