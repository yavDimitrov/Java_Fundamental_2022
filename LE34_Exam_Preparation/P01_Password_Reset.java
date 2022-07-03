package LE34_Exam_Preparation;

import java.util.Scanner;

public class P01_Password_Reset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(scan.nextLine());

        String line = scan.nextLine();
        while (!line.equals("Reveal")) {
            String[] data = line.split(":\\|:");
            String command = data[0];

            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    sb.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder(data[1]);
                    if (sb.toString().contains(substring.toString())) {
                        int start = sb.indexOf(substring.toString());
                        int end = start + sb.length() - 1;
                        sb.delete(start, end + 1);
                        substring.reverse();
                        sb.append(substring);
                    } else {
                        System.out.println("error");
                        line = scan.nextLine();
                        continue;
                    }

                    break;
                case "ChangeAll":
                    String occurrence = data[1];
                    String replacement = data[2];
                    String replacedString = sb.toString().replaceAll(occurrence, replacement);
                    sb.setLength(0);
                    sb.append(replacedString);

                    break;
            }

            System.out.println(sb.toString());
            line = scan.nextLine();
        }
        System.out.println("You have a new text message: " + sb.toString());
    }
}
