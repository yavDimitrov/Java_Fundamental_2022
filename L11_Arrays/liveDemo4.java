package L11_Arrays;

import java.util.Scanner;

public class liveDemo4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String lineOfNumbers = scan.nextLine();
        String [] numbersAsStrings = lineOfNumbers.split("\\s+");

        //int [] numbers = new int [numbersAsStrings.length];
        int sum = 0;
        for ( int i = 0; i < numbersAsStrings.length; i++){
            sum += Integer.parseInt(numbersAsStrings[i])  ;

        }
        System.out.println(sum);
    }
}
