package L24_Associative_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo3_Lambda3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String digitName = scan.nextLine();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 );

        List<String> filtered = numbers.stream()
                .map(n -> n*2)
                .map(n -> "number : " + n)
                .collect(Collectors.toList());




        for (String integer: filtered ) {
            System.out.print(integer + " ");
        }

    }

}

