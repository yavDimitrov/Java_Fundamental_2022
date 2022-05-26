package L24_Associative_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demo3_Lambda2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String digitName = scan.nextLine();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 );

        List<Integer> filtered = numbers.stream().filter(n -> n >2)
                .filter(n -> n < 8)
                .filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> filteredWithLoop = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > 2 ){
                filteredWithLoop.add(number);
            }
        }


        for (Integer integer: filtered ) {
            System.out.print(integer + " ");
        }

    }

}

