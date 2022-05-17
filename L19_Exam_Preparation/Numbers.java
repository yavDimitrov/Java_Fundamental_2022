package L19_Exam_Preparation;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        double sum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currNum = numbersArr[i];
            sum = sum + currNum;
        }

        double avg = sum / numbersArr.length;

        List<Integer> topNumbers = new ArrayList<>();

        for (int i = 0; i < numbersArr.length; i++) {

            int currNum = numbersArr[i];

            if (currNum > avg) {
                topNumbers.add(currNum);
            }
        }
        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()){
                System.out.println("No");
            } else {
                System.out.println(topNumbers.toString().replaceAll("[\\[\\],]", ""));
            /* double num = Double.parseDouble(scan.nextLine());
            DecimalFormat df = new DecimalFormat("##0.###"); - number will be 9.456
            System.out.println(df.format(num)); */
            }
        }
    }

