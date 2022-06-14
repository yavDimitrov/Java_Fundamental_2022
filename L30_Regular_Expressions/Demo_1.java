package L30_Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      /*
        ^\w=@[A-Za-z]+\.[a-zA-Z]+$
        name@email.com


        \b(\d{1,2}) - (?<month>Jan|Feb|Mar|Apr|Jun) - (\d{4})\b
        22-Feb-2022
        */
       Pattern pattern = Pattern.compile("you");
       Pattern patternEXPER = Pattern.compile("you", Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);

       String text = "On the first line you will receive a number n. On the next n lines, you will be given some " +
               "information about the plants that you have discovered in the format: \"{plant}<->{rarity}\"." +
               " Store that information, because you will need it later. If you receive a plant more than " +
               "once, update its rarity.";

       String MATCH = "123456789";

        Matcher ToMatcher = pattern.matcher(text);

        boolean isValid = ToMatcher.find();
        // boolean isValid = ToMatcher.matches();

        if (isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
        String censored = text.replaceAll("you", "YOU");

        while(isValid){
            System.out.println(ToMatcher.group());
            isValid = ToMatcher.find();
        }

        System.out.println(censored);

        System.out.println(MATCH.matches("\\d+"));
    }
}
