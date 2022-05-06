package L11_Arrays;

import java.util.Scanner;

public class liveDemo1 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        //int numbersCount = scan.nextInt();
        int [] numbers = new int[] {1, 13, 69};


        for ( int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);

            if (i != numbers.length - 1) {
                System.out.print(",");
        }

        }
    }
}
