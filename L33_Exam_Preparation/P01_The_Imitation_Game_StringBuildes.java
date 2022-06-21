package L33_Exam_Preparation;

import java.util.Scanner;

public class P01_The_Imitation_Game_StringBuildes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scan.nextLine());

        String command = scan.nextLine();

        while (!command.equals("Decode")) {
            // TODO : work
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Move":
                    move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    insert(message, Integer.parseInt(commandParts[1]), commandParts[2] );
                    break;
                case "ChangeAll":
                    changeAll(message, commandParts[1], commandParts[2]);
                    break;

                default:
                    throw new IllegalStateException("Unknown command" + commandName + "in" + command);

            }


            command = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static void changeAll(StringBuilder message, String substr, String replacement) {
        int nextMatch = message.indexOf(substr);
        while(nextMatch != -1) {
            message.replace(nextMatch, nextMatch + substr.length(), replacement);


            nextMatch = message.indexOf(substr, nextMatch);
        }
       //  message.replace(0,message.length(), message.toString().replace(substr,replacement));
    }

    private static void insert(StringBuilder message, int index, String substring) {
        message.insert(index, substring);
    }

    private static void move(StringBuilder message, int lenght) {
            String firstPart = message.substring(0, lenght);
            message.replace(0, lenght, "");
            message.append(firstPart);
    }
}
