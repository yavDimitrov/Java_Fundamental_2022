package L27_Text_Processing;

public class demo_removeWord {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        String text = "the quick brouwn fox jumps over the lazy dog.";

       String removeWord = "fox";
       int removeIndex = text.indexOf(removeWord);

       while(removeIndex != -1){
           String firstPart = text.substring(0,removeIndex);
           String secondPart = text.substring(removeIndex + removeWord.length());
           text = firstPart + secondPart;

           removeIndex = text.indexOf(removeWord);
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
