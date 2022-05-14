package LE17_List_Exercises;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class liveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // add remove set
        // Peter NIkolay Kaloyan

        String [] names = {"Peter", "nikolay", "Kaloyan"};
        String [] names2 = new String [3];

        List<String> namesLinst = new ArrayList<>();
        namesLinst.add("Peter");
        namesLinst.add("Nikolay");
        namesLinst.add("Kaloyan");

        List<String> namesLinst2 = new ArrayList<>(Arrays.asList("Peter", "nikolay", "Kaloyan"));


        namesLinst2.remove("Kaloyan");
        namesLinst2.remove("Nikolay");
        namesLinst2.set(0, "Sofia");

        System.out.println(namesLinst2);
    }
}
