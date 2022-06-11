package LE28_Text_Processing;

import java.util.Scanner;

public class P02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(" ");
        char[] text1 = data[0].toCharArray();
        char[] text2 = data[1].toCharArray();

        int smallerTextLenght = Math.min(text1.length, text2.length);
        int biggerTextLenght = Math.max(text1.length, text2.length);

        int sum = 0;

        for (int i = 0; i < biggerTextLenght; i++) {
            if(i < smallerTextLenght){
                sum += text1[i]*text2[i];
            } else if (text1.length > text2.length){
                sum += text1[i];
            } else {
                sum += text2[i];
            }

        }
        System.out.println(sum);
    }
}
