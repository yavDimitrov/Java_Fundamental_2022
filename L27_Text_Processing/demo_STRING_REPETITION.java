package L27_Text_Processing;

import java.util.Scanner;

                                                    //ПОВТАРЯНЕ НА СТРИНГОВЕ

public class demo_STRING_REPETITION {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] words = scan.nextLine().split("\\s+");

        for (String word : words) {
            System.out.println(repeat(word, word.length()));
        }
    }

    static String repeat(String word, int repetitions){
        char [] repeated = new char[ word.length()*repetitions ];

        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = word.charAt( i % word.length() );

        }
        return new String (repeated);
    }
}
