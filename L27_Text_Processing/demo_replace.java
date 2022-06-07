package L27_Text_Processing;

import static L27_Text_Processing.demo_STRING_REPETITION.repeat;

public class demo_replace {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        String text = "the quick brouwn fox jumps over the lazy dog.";

      String [] bannedWords = new String[] {"the", "lazy"} ;
        for (String bannedWord : bannedWords) {
            String censored = repeat("*", bannedWord.length());
            text = text.replace(bannedWord, censored);
        }

        System.out.println(text);
    }

    private static int indesOf(String s, char split) {
        int splitIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == split){
                splitIndex = i;
                break;
            }

        }
        return splitIndex;
    }
}
