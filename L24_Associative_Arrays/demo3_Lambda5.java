package L24_Associative_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class demo3_Lambda5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String digitName = scan.nextLine();
        String[] strings = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

       /*       List<Integer> result = numbers.stream()
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 3 == 0)
                .map(n -> n*2)
                .collect(Collectors.toList());          */

        int [] result = Arrays.stream(strings)
                .map(s -> Integer.parseInt(s))
                .mapToInt(n -> n)
                .toArray();






    }

}

