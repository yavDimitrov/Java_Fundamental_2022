package L24_Associative_Arrays;

import java.util.*;

public class demo3_Lambda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String digitName = scan.nextLine();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 );

        List<Integer> filtered = filterLargerThan(numbers, 2);
        filtered = filterSmallerThan(filtered, 8);
        filtered = filterdevisibleBy(filtered, 2);
        for (Integer integer: filtered ) {
            System.out.print(integer + " ");
        }

    }
    private static List<Integer> filterLargerThan (List<Integer> numbers, int n){
        List<Integer> larger = new ArrayList<>();
        for (Integer number : numbers) {
            if(number > n) {
                larger.add(number);
            }
        }
        return larger;
    }

    private static List<Integer> filterSmallerThan (List<Integer> numbers, int n){
        List<Integer> larger = new ArrayList<>();
        for (Integer number : numbers) {
            if(number < n) {
                larger.add(number);
            }
        }
        return larger;
    }
    private static List<Integer> filterdevisibleBy (List<Integer> numbers, int n){
        List<Integer> larger = new ArrayList<>();
        for (Integer number : numbers) {
            if(number % n == 0) {
                larger.add(number);
            }
        }
        return larger;
    }
}

