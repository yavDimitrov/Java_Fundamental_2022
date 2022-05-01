package L5_Syntax_CondState_Loops;
import java.util.Scanner;

public class N_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddNumbersFound = 0;
        int number = 1;
        int n = sc.nextInt();
        while (oddNumbersFound < n){
            if (number %2 !=0){
                System.out.println(number);
                oddNumbersFound ++;
            }
            number ++;

        }

    }
}
