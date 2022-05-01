package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int n = 1;
        int i = 1;
        while( n <= number){
            while(i <= n){
                System.out.print(n +" ");
                i ++;
            }
            System.out.println();
            n++;
            i = 1;
        }

    }
}
