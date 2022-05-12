package L16_List;

import java.util.ArrayList;
import java.util.List;

public class listDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(1);
        numbers.add(0);

        // int x =0; така ще премахне стойността 0, а както е от долу ще премахне индекс 0
        Integer x = 0;
        numbers.remove(x);

        for(int n : numbers){
            System.out.println(n);

        }
    }
}
