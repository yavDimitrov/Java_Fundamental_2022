package L14_Methods;

public class repeatString {
    public static void main(String[] args) {
        String s = "hello";

        int repetition = 3;

        String repeated = repeatedString(s, repetition);


        System.out.println(repeated);

        // for (int i = 0; i < ; i++) {

    }

    private static String repeatedString(String s, int repetition) {
        String[] strings = new String[repetition];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = s;
        }

        String repeated =  String.join("", strings);

        return null;
    }
}
