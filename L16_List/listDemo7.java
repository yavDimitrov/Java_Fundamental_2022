package L16_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listDemo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = nextLineOfNumbers (scan);

       /*
        for (int i = 0; i < numbersAsStrings.length; i++) {
            numbers.add(Integer.parseInt(numbersAsStrings[i]));

        }  */
    for(int number : numbers){
        System.out.println(number);

    }

}

    private static List<Integer> nextLineOfNumbers(Scanner scan) {
        List<Integer> numbers = new ArrayList<>();
        String lineOfNumbers = scan.nextLine();
        String[] numbersAsStrings = lineOfNumbers.split(" ");

        for (String s : numbersAsStrings) {
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }

    private static void removeAll(List<String> elements, String value) {
        int i = 0;
        while (i < elements.size()) {
            if (elements.get(i).equals(value)) {
                elements.remove(i);
            } else {
                i++;
            }
        }
    }

}
