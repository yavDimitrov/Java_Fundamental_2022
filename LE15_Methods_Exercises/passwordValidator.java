package LE15_Methods_Exercises;

import java.util.Locale;
import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();

       /*   6 – 10 characters (inclusive);
            Consists only of letters and digits;
            Have at least 2 digits */
        passLenghtValidation(pass); // -> boolean

        consistOnlyLettersAndDigits(pass); // -> boolean

        haveAtLeast2Digits(pass); // -> boolean

        if (passLenghtValidation(pass) && consistOnlyLettersAndDigits(pass) && haveAtLeast2Digits(pass)) {
            System.out.println("Password is valid");
        }

        if (!passLenghtValidation(pass)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!consistOnlyLettersAndDigits(pass)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!haveAtLeast2Digits(pass)) {
            System.out.println("Password must have at least 2 digits");
        }


    }

    public static boolean passLenghtValidation(String pass) {

        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean consistOnlyLettersAndDigits(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.toLowerCase().charAt(i);
            if(!(symbol >= 65 && symbol <= 90 || symbol >= 97 && symbol <= 122 || symbol >= 48 && symbol <= 57)){
                return false;
            }
        }
        return true;
    }

    public static boolean haveAtLeast2Digits(String pass) {
        int count = 0;
        for (int i = 0; i < pass.length(); i++) {
            char symbol = pass.charAt(i);
                        if(symbol >= 48 && symbol <= 57){
                count ++;
            }
        }
        return count >= 2;
    }
}
