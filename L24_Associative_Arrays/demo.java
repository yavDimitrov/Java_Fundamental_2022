package L24_Associative_Arrays;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digitName = scan.nextLine();

        Map<String, Integer> digitValues = new HashMap<>();
        digitValues.put("zero", 0);
        digitValues.put("one", 1);
        digitValues.put("two", 2);
        digitValues.put("three", 3);

        digitValues.remove("two");

        List<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3));
        for (Integer num : nums){

        }
        for (Map.Entry<String, Integer> entry : digitValues.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            
        }

        digitValues.put("three", 300);
        System.out.println(digitValues.get(digitName));
    }
}
