package L16_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listDemo6 {
    public static void main(String[] args) {
        List<String> words = new ArrayList(Arrays.asList("abc", "def", "abc", "abc", "def"));


        removeAll(words, "def");

        for (String word : words) {
            System.out.print(words + " ");

        }
    }

    private static void removeAll(List<String> elements, String value) {
        int i = 0;
        while (i < elements.size()) {
            if (elements.get(i).equals(value)){
                elements.remove(i);
            } else {
                i++;
            }
        }
    }

}
