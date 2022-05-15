package LE17_List_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_cardGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String player1 = scan.nextLine();
        String player2 = scan.nextLine();

        List<Integer> deck1 = Arrays.stream(player1.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream(player2.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int deck1Sum = 0;
        int deck2Sum = 0;

        while (!deck1.isEmpty() && !deck2.isEmpty()) {

            if (deck1.get(0) > deck2.get(0)) {
                int currN = deck1.get(0);
                deck1.remove(0);
                deck1.add(currN);
                deck1.add(deck2.get(0));
                deck2.remove(0);
            } else if (deck1.get(0) == deck2.get(0)) {
                deck1.remove(0);
                deck2.remove(0);

            } else {
                int currN = deck2.get(0);
                deck2.remove(0);
                deck2.add(currN);
                deck2.add(deck1.get(0));
                deck1.remove(0);
            }
        }

        if (!deck1.isEmpty()) {
            for (int i = 0; i < deck1.size(); i++) {
                deck1Sum += deck1.get(i);
            }
        }
        if (!deck2.isEmpty()) {
            for (int i = 0; i < deck2.size(); i++) {
                deck2Sum += deck2.get(i);
            }

        }

        if (!deck1.isEmpty()) {
            System.out.printf("First player wins! Sum: %d", deck1Sum);
        }
        if(!deck2.isEmpty()){
            System.out.printf("Second player wins! Sum: %d", deck2Sum);
        }


    }
}
