package LE25_Exercise_Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02_minerTask_Expertise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String resource = scan.nextLine();
        Map<String, Integer> recourses = new LinkedHashMap<>();

        while(!resource.equals("stop")){
            int quantity = Integer.parseInt(scan.nextLine());
            recourses.putIfAbsent(resource, 0);
            recourses.put( resource, recourses.get(resource)+quantity);

           resource = scan.nextLine();
        }
        recourses.forEach((k, v) -> System.out.printf("%s –> %d%n", k, v));
    }
}
