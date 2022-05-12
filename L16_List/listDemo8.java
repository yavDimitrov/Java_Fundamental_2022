package L16_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class listDemo8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // List<Integer> numbers = nextLineOfNumbers (scan);

        List<Integer> numbers = new ArrayList<>(Arrays.asList(8, 2 ,2 ,4 ,8 ,16));

        List<Integer> nextNumbers = sumAdjecentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()){
            numbers = nextNumbers;
            nextNumbers = sumAdjecentEqualNumbers(numbers);
        }

        numbers = nextNumbers;
    for(int number : numbers){
        System.out.print(number + " ");

    }

}

    private static List<Integer> sumAdjecentEqualNumbers(List<Integer> numbers) {
        List<Integer> nextNumbers = new ArrayList<>();
        int i = 0;
        while ( i < numbers.size()) {
            if (i < numbers.size() - 1 && numbers.get(i) == numbers.get(i+1)) {
                nextNumbers.add(numbers.get(i) + numbers.get(i+1));
                i += 2;
            } else {
                nextNumbers.add(numbers.get(i));
                i ++;
            }
        }
        return nextNumbers;
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
