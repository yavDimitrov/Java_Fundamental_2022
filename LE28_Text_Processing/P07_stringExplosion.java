package LE28_Text_Processing;

import java.util.Scanner;

public class P07_stringExplosion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());
        int strenght = 0;
        for (int i = 0; i < sb.length(); i++) {
            if(strenght > 0 && sb.charAt(i) != '>'){
                sb.deleteCharAt(i);
                strenght --;
                i--;
            } else if (sb.charAt(i) == '>'){
                strenght += Integer.parseInt(String.valueOf(sb.charAt(i +1)));
            }
        }
        System.out.println(sb);
    }
}
