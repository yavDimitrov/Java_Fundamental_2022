package L11_Arrays;

import java.util.Scanner;

public class sumEvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String [] numbersAsStrings = line.split("\\s+");

        int evenSum = 0;
        int oddSum = 0;

        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);

            if(number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

        }

    }
}
