package L27_Text_Processing;

import java.util.Scanner;

public class demo_findIndex {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        String text = "the quick brouwn fox jumps over the lazy dog.";
        String search = "the";

        int index = text.indexOf(search);

        while(index != -1){
            System.out.println(index);
            index = text.indexOf(search, index+1);
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
