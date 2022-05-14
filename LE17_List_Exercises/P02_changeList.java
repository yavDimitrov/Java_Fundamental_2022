package LE17_List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_changeList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String line = scan.nextLine();
        while(!line.equals("end")){
            String [] data = line.split("\\s+");
            String command = data [0];

            switch(command){
                case "Delete":
                    int element = Integer.parseInt(data[1]);

                    for (int i = 0; i < numbers.size(); i++) {
                        if(numbers.get(i) == element){
                            numbers.remove(i);
                            i--;
                        }
                    }
                    break;

                case "Insert":
                     element = Integer.parseInt(data [1]);
                     int possition = Integer.parseInt(data[2]);
                     numbers.add(possition, element);
                    break;
            }
            line = scan.nextLine();
        }
        numbers.forEach(el -> System.out.print(el + " "));
    }
}
