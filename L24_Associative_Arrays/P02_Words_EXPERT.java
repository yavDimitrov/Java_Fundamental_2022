package L24_Associative_Arrays;

import java.util.*;

public class P02_Words_EXPERT {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hallo", "bye", "the", "quick", "brown",
                "fox", "jumps", "over", "the", "lazy", "dog");

        Map<Integer, List<String>> wordsByLenght = new TreeMap<>();
        for (String word : words) {
            int key = word.length();
            List<String> values = wordsByLenght.get(key);
            if (values == null) {
                values = new ArrayList<>();
                wordsByLenght.put(key, values);
            }

            values.add(word);
        }
    }
/*
        for (Map.Entry<Integer, List<String>> entry : wordsByLenght.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (String word : entry.getValue()){
                System.out.print( word  + ", ");
            }
            System.out.println();
        }


        // bye, the, fox, the, dog

    }      */
}
