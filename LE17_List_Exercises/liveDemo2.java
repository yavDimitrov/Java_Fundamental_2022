package LE17_List_Exercises;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class liveDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // add remove set
        // Peter NIkolay Kaloyan


        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer :: parseInt).collect(Collectors.toList());
       // String [] names = scan.nextLine().split("\\s+");



        System.out.println(numbers);
    }
}
