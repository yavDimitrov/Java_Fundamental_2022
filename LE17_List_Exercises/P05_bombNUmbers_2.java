package LE17_List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_bombNUmbers_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                 .map(Integer :: parseInt).collect(Collectors.toList());
         String [] data = scan.nextLine().split("\\s+");
         int bomb = Integer.parseInt(data[0]);
         int power = Integer.parseInt(data[1]);


        while(numbers.contains(bomb)){
            int bombIndex = numbers.indexOf(bomb);

            int start = Math.max(0,  bombIndex - power);
            int end = Math.min(numbers.size() - 1,  bombIndex + power);

           //  int start = bombIndex - power;
           // int end = bombIndex + power;



         /*   if(start < 0){
                start = 0;
            }
            if(end >= numbers.size()){
                end = numbers.size() - 1;

            } */
            for (int i = start; i <= end; i++) {
                numbers.remove(start);

            }
        }
        int sum = 0;
        for(Integer number : numbers ){
            sum += number;
        }
        System.out.println(sum);
    }
}
