package L33_Exam_Preparation;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Destination_Mapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][a-zA-Z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        boolean foundSomething = matcher.find();

        while(foundSomething){
            String destination = matcher.group("destination");
            destinations.add(destination);
            travelPoints += destination.length();


            foundSomething = matcher.find();
        }


        System.out.println("Destinations: " + String.join(", ", destinations));

        // System.out.println("Travel Points: " + travelPoints);
        System.out.println("Travel Points: " + destinations.stream().mapToInt(d -> d.length()).sum());
    }
}
