package L16_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listDemo2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList(Arrays.asList("abc", "def", "abc", "abc", "def"));

        /* boolean didExist = words.remove("abc");
        while(didExist){
            didExist =words.remove("abc");
        } */
        words.add(1, "shalala");

        for (String word : words) {
            System.out.print(words + " ");

        }
    }
}
