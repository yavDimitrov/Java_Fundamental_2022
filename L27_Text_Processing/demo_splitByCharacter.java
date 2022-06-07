package L27_Text_Processing;

import java.util.Scanner;

public class demo_splitByCharacter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = "the quick brouwn fox jumps over the lazy dog.";
        char split = 'f';

        int splitIndex = indesOf(text, split);

        if(splitIndex != -1) {
            String beforeSplit = text.substring(0, splitIndex);
            String afterSplit = text.substring(splitIndex);
            
            System.out.println(beforeSplit);
            System.out.println(afterSplit);
        } else {
            System.out.println(text);
        }


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
