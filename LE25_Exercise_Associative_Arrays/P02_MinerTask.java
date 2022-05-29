package LE25_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_MinerTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        Map<String, Integer> recourses = new LinkedHashMap<>();

        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());

            if(!recourses.containsKey(resource)){
                recourses.put(resource, quantity);
            } else {
                recourses.put( resource, recourses.get(resource)+quantity);
            }

            resource = scan.nextLine();
        }
        recourses.forEach((k, v) -> System.out.printf("%s -> %d%n", k, v));
    }
}
