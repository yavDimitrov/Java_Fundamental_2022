package L11_Arrays;

import java.util.Scanner;

public class ConvertArrayNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String lineofNumbers = scan.nextLine();

        String[] numbersAsString = lineofNumbers.split("\\s+");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length ; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        for (int i = 0; i < numbers.length / 2 ; i++){
            int otherIndex = numbers.length -1 - i;
            int currentNumber = numbers[i];
            numbers [i] = numbers [otherIndex];
            numbers [otherIndex] = currentNumber;
        }

        for ( int i = 0 ; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}