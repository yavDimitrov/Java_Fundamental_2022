package L27_Text_Processing;

public class demo_contains {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        String text = "the quick brouwn fox jumps over the lazy dog.";

        System.out.println(text.contains("fox"));
        System.out.println(text.indexOf("fox") != -1);

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
