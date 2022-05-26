package L24_Associative_Arrays;

import java.util.*;

public class P01_countStrings {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(Arrays.<String>asList("a8.0", "a2.0", "a2.0", "a8.0", "a2.0"));
        Map<String, Integer> numberCounts = new TreeMap<>();

        for (String number : numbers) {
            if (numberCounts.containsKey(number)) {
                int curentCount = numberCounts.get(number);
                numberCounts.put(number, curentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }

            for (Map.Entry<String, Integer> entry : numberCounts.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }


    }
}
