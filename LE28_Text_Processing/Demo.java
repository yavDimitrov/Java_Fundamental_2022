package LE28_Text_Processing;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        sb.append("Set");
        sb.append(System.lineSeparator());
        sb.append("neprotivokonstintucionstwuwatelstwuwajte");
        sb.insert(3, "Milkov");
        sb.delete(30, sb.length());

        System.out.println(sb);
    }
}
