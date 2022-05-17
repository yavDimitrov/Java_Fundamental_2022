package L19_Exam_Preparation;

import java.util.Scanner;

public class P03_shootForTheWin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] targets = nextIntArray(scan);


        String command = scan.nextLine();
        int totalShot = 0;
        while (!command.equals("End")) {
            int targetIndex = Integer.parseInt(command);
            // TODO:processs
            if (isValidIndex(targets, targetIndex)) {
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1) {
                    totalShot++;
                    targets[targetIndex] = -1;
                    registerTargetHit(targets, shotTarget);
                }

            }

            command = scan.nextLine();

        }
        System.out.printf("Shot targets: %d -> ", totalShot);
        printArray(targets, " ");
    }

    private static void registerTargetHit(int[] targets, int shotTarget) {
        for (int i = 0; i < targets.length; i++) {
            if (targets[i] != -1) {
                if (targets[i] > shotTarget) {
                    targets[i] -= shotTarget;
                } else {
                    targets[i] += shotTarget;
                }
            }
        }
    }

    private static boolean isValidIndex(int[] array, int targetIndex) {
        return targetIndex >= 0 && targetIndex < array.length;
    }

    private static int[] nextIntArray(Scanner scan) {
        String[] intAsStrings = scan.nextLine().split("\\s+");
        int[] array = new int[intAsStrings.length];
        for (int i = 0; i < intAsStrings.length; i++) {
            array[i] = Integer.parseInt(intAsStrings[i]);
        }
        return array;
    }

    private static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
}
