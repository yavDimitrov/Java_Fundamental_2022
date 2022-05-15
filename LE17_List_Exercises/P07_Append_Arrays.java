package LE17_List_Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_Append_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] line = scan.nextLine().split("\\|");
        List<Integer> numbers = new ArrayList<>();

        for (int i = line.length - 1; i >= 0; i--) {
            String[] lineToNumbers = line[i].split("\\s+");

            for (int j = 0; j < lineToNumbers.length; j++) {
                if (lineToNumbers[j].matches("-?\\d+")) {
                    numbers.add(Integer.valueOf(lineToNumbers[j]));
                }
            }


        }
        numbers.forEach(el -> System.out.print(el + " "));

    }
}
