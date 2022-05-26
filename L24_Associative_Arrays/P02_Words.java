package L24_Associative_Arrays;

import java.util.*;

public class P02_Words {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("Hallo", "bye", "the", "quick", "brown",
                "fox", "jumps", "over", "the", "lazy", "dog");

        Map<Integer, List<String>> wordsByLenght = new TreeMap<>();
        for (String word : words ) {
            int key = word.length();
            List<String> values = wordsByLenght.get(key);
            if (values != null) {
                values.add(word);
            } else {
                values = new ArrayList<>();
                values.add(word);
                wordsByLenght.put(key, values);
            }
        }
        int entriesSoFar = 0;
        for (Map.Entry<Integer, List<String>> entry : wordsByLenght.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            for (String word : entry.getValue()){
                System.out.print( word  + ", ");
            }
            System.out.println();

            if(entriesSoFar < wordsByLenght.size() - 1) {
                System.out.println("=================================");
            }
            entriesSoFar ++;
        }


        // bye, the, fox, the, dog


    }
}
