package LE15_Methods_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();

        while (!number.equals("END")) {

            palindromeCheck(number);

            number = scan.nextLine();
        }
       //  System.out.println(number);
    }

    public static void palindromeCheck(String number) {
        int[] nums = new int[number.length()];
        int[] numsRev = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            nums[i] = number.charAt(i);
        }
        int j = 0;
        for (int i = number.length()-1 ; i >= 0; i--) {

            numsRev[j] = number.charAt(i);
            j++;
        }
        int lenght = number.length()-1;
        boolean isTrue = true;
        while(lenght>=0) {
            if ((numsRev[lenght] != nums[lenght])) {
                System.out.println("false");
                isTrue = false;
                break;
            }
            lenght--;
        }
        if(isTrue){
            System.out.println("true");
        }
    }
}