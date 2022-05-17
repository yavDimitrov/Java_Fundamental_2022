package L19_Exam_Preparation;

import java.util.Scanner;

public class softUni_Reception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int employeeFirst = scan.nextInt();
        int employeeSecond = scan.nextInt();
        int employeeThird = scan.nextInt();

        int studentsPerHour = employeeFirst + employeeThird + employeeSecond;

        int remaining = scan.nextInt();


        int hoursPassed = 0;

        // to do ;
        while(remaining > 0){
            hoursPassed ++;
            if(hoursPassed % 4 != 0) {
                remaining -= studentsPerHour;
            }

        }
        System.out.printf("Time needed: %dh.", hoursPassed);

    }
}
