package L21_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Date;

public class timeMeasure {
    public static void main(String[] args) {

        int n =5;
        BigInteger factoriel = BigInteger.valueOf(1);
        for (int i = 1; i < n; i++) {
            factoriel = factoriel.multiply(BigInteger.valueOf(i));

        }
        System.out.println(factoriel);

        int x = 0;
        Date start = new Date();
        for (int repetition = 0; repetition < 5; repetition++) {
            for (int j = 1 ; j < Integer.MAX_VALUE; j++) {
                x *= j;

            }

        }
        Date end = new Date();

        System.out.println(end.getTime() - start.getTime());

        System.out.println(x);
    }
}
