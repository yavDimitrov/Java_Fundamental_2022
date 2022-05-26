package L24_Associative_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo3_Lambda4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String digitName = scan.nextLine();
        String[] strings = new String [] {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

       /*       List<Integer> result = numbers.stream()
                .map(s -> Integer.parseInt(s))
                .filter(n -> n % 3 == 0)
                .map(n -> n*2)
                .collect(Collectors.toList());          */

        double [] result = Arrays.stream(strings)
                .map(s -> Integer.parseInt(s))
                .filter( n -> n % 3 == 0)
                .map(n -> n * 2)
                .mapToDouble(n -> n)
                .toArray();






    }

}

