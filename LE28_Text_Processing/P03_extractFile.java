package LE28_Text_Processing;

import java.util.Scanner;

public class P03_extractFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String filePath = scan.nextLine();

        String fileName = filePath.substring(filePath.lastIndexOf("\\") + 1, filePath.indexOf("."));
        String fileExtension = filePath.substring(filePath.indexOf(".") + 1);

        System.out.println("File name: " + fileName);
        System.out.println("File extension: ".concat(fileExtension));

    }
}
