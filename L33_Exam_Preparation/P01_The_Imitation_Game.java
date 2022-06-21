package L33_Exam_Preparation;

import java.util.Scanner;

public class P01_The_Imitation_Game {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String message = scan.nextLine();

        String command = scan.nextLine();

        while (!command.equals("Decode")) {
            // TODO : work
            String[] commandParts = command.split("\\|");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Move":
                    message = move(message, Integer.parseInt(commandParts[1]));
                    break;
                case "Insert":
                    message = insert(message, Integer.parseInt(commandParts[1]), commandParts[2] );
                    break;
                case "ChangeAll":
                    message = changeAll(message, commandParts[1], commandParts[2]);
                    break;

                default:
                    throw new IllegalStateException("Unknown command" + commandName + "in" + command);

            }


            command = scan.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }

    private static String changeAll(String message, String substr, String replacement) {
        return message.replace(substr, replacement) ;
    }

    private static String insert(String message, int index, String substring) {

        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);

        return firstPart + substring + secondPart;
    }

    private static String move(String message, int lenght) {
            String firstPart = message.substring(0, lenght);
            String secondPart = message.substring(lenght);

        return secondPart + firstPart;
    }
}
