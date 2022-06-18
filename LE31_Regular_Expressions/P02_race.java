package LE31_Regular_Expressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02_race {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameRegex = "[A-Za-z]+";
        String distanceRegex = "[\\d]";
        List<String> names = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> racers = new LinkedHashMap<>();

        for (String name : names) {
            racers.putIfAbsent(name, 0);

        }
        Pattern namePatt = Pattern.compile(nameRegex);
        Pattern distancePatt = Pattern.compile(distanceRegex);

        String line = scan.nextLine();
        while (!line.equals("end of race")) {
            Matcher nameMatch = namePatt.matcher(line);
            StringBuilder sb = new StringBuilder();
            while (nameMatch.find()) {
                sb.append(nameMatch.group());
            }

            if (racers.containsKey(sb.toString())) {
                Matcher distanceMatch = distancePatt.matcher(line);
                int sum = 0;
                while (distanceMatch.find()) {
                    int digit = Integer.parseInt(distanceMatch.group());

                    racers.put(sb.toString(), racers.get(sb.toString()) + digit);
                }
            }

            line = scan.nextLine();
        }

        // ВЗИМА МАП И СОРТИРА ПО ЧИСЛО (СТОЙНОСТТА НА МАПА) КАТО ЗАПИСВА В НОВ
        // ЛИСТ КЛЮЧА СЛЕД ТОВА ПРИНТИРА ЛИСТА С ВАРИАЦИЯ В СТРИНГА СПРЯМО ИТЕРАЦИЯТА

        List<String> sorted = racers.entrySet().stream()
                .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toList());

        String text = "";
        for (int i = 0; i < sorted.size(); i++) {
            if (i == 3) {
                break;
            }
            text = i == 0 ? "st" : i == 1 ? "nd" : i == 2 ? "rd" : "";
           /* switch (i) {
                case 0:
                    System.out.printf("1st place: %s%n", sorted.get(i));
                    break;
                case 1:
                    System.out.printf("2nd place: %s%n", sorted.get(i));
                    break;
                case 2:
                    System.out.printf("3rd place: %s%n", sorted.get(i));
                    break;
            } */
            System.out.printf("%d%s place: %s%n", i+1, text, sorted.get(i));
        }


    }
}
