package L14_Methods;

import java.util.Scanner;

public class printTriangle {
    public static void main(String[] args) {
        // int number = new Scanner(System.in).nextInt();
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        printNumberTriangle(num);

    }

    private static void printNumberTriangle(int num) {
        for (int lenght = 1; lenght <= num; lenght++) {
            printIncreasingNumbers(lenght);
        }

        for (int lenght = num -1; lenght > 0 ; lenght--) {
            printIncreasingNumbers(lenght);
        }
    }

    private static void printIncreasingNumbers(int lenght) {
        for (int i = 1; i <= lenght; i++) {
            System.out.print(i);
            if (i < lenght) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
