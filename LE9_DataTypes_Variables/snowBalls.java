package LE9_DataTypes_Variables;

import java.util.Scanner;

public class snowBalls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double maxsnowballValue = 0.0;
        int maxsnowballSnow = 0;
        int maxsnowballTime = 0;
        int maxsnowballQuality = 0;

        for( int i = 0; i < n; i++) {
//  (snowballSnow / snowballTime) ^ snowballQuality
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime),snowballQuality);

            if(maxsnowballValue < snowballValue) {
                maxsnowballValue = snowballValue;
                 maxsnowballSnow = snowballSnow;
                 maxsnowballTime = snowballTime;
                 maxsnowballQuality = snowballQuality;
            }


        }
        //{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})

        System.out.printf("%d : %d = %.0f (%d)",maxsnowballSnow , maxsnowballTime , maxsnowballValue, maxsnowballQuality);

    }
}
