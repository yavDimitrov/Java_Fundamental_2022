package LE9_DataTypes_Variables;

import java.util.Scanner;

public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String maxModel = null ;
        double maxVolume = 0;
       //  int maxHeight = 0;


        for (int i = 0; i < n; i++){
            String model = scan.nextLine() ;
            double rad = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            double volume =  (Math.PI*Math.pow(rad, 2)*height);

            if(maxVolume <= volume){
                maxVolume = volume;
                maxModel = String.valueOf(model);

            }
        }

        System.out.println(maxModel);

    }
}
