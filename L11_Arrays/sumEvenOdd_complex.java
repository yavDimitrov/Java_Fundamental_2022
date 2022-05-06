package L11_Arrays;

import java.util.Scanner;

public class sumEvenOdd_complex {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String line = scan.nextLine();
            String [] numbersAsStrings = line.split("\\s+");

            int evenSum = 0;
            int oddSum = 0;
            int [] sums = new int[2];
            for (String s : numbersAsStrings) {
                int number = Integer.parseInt(s);
                sums [number % 2] += number;
            }
            System.out.println(sums[0]-sums [1]);
        }
    }
