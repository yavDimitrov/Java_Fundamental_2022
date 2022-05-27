package L24_Associative_Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Words_even_Letters {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String line = new Scanner(System.in).nextLine();


        String [] split =  line.split("\\s+");
        List<String> result = Arrays.stream(split)
                .filter(s -> s.length() % 2 == 0).collect(Collectors.toList());

        for (String s:result ) {
            System.out.println(s);
        }


    }

}

