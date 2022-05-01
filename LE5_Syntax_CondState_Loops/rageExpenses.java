package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*On the first input line - lost games count – integer in the range [0, 1000].
         *On the second line – headset price - the floating-point number in the range [0, 1000].
         *On the third line – mouse price - the floating-point number in the range [0, 1000].
         *On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
         *On the fifth line – display price - the floating-point number in the range [0, 1000]. */

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetP = Double.parseDouble(scan.nextLine());
        double mouse = Double.parseDouble(scan.nextLine());
        double keyboard = Double.parseDouble(scan.nextLine());
        double dispay = Double.parseDouble(scan.nextLine());
        double expense = 0.0;
        int keyboardcount = 0;

        /*Every second lost game, Peter trashes his headset.
          Every third lost game, Peter trashes his mouse.
          When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
          Every second time, when he trashes his keyboard, he also trashes his display. */

        for (int i =1; i<= lostGames; i++) {

            if(i % 2 ==0) {
                expense += headsetP;
            }
            if(i % 3 == 0){
                expense += mouse;
            }
            if(i % 3 == 0 && i % 2 == 0){
                expense += keyboard;
                keyboardcount ++;
                if (keyboardcount % 2 == 0 ){
                    expense += dispay;
                }
            }
        }

        System.out.printf("Rage expenses: %.02f lv.", expense);

    }
}
