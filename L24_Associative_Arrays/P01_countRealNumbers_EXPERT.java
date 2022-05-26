package L24_Associative_Arrays;

import java.util.*;

public class P01_countRealNumbers_EXPERT {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>(Arrays.<Double>asList(8.0, 2.0, 2.0, 8.0, 2.0));
        Map<Double, Integer> numberCounts = new TreeMap<>();

        for (Double number : numbers) {
            Integer currentCount = numberCounts.get(number);
            if (currentCount != null) {
                numberCounts.put(number, currentCount + 1);
            } else {
                numberCounts.put(number, 1);
            }
        }

            for (Map.Entry<Double, Integer> entry : numberCounts.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }


    }
}
