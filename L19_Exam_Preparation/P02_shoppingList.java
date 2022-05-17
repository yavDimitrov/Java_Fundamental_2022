package L19_Exam_Preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_shoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> productList = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());


        String inputLine = scan.nextLine();

        while (!inputLine.equals("Go Shopping!")) {

            String[] commandArr = inputLine.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Urgent":
                    String idemToAdd = commandArr[1];

                    if (!productList.contains(idemToAdd)) {
                        productList.add(0, idemToAdd);
                    }
                    break;
                case "Unnecessary":
                    String itemToRemove = commandArr[1];
                    productList.remove(itemToRemove);

                    break;
                case "Correct":
                    String oldItem = commandArr[1];
                    String newItem = commandArr[2];

                    for (int i = 0; i < productList.size(); i++) {
                        if (productList.get(i).equals(oldItem)) {
                            productList.set(i, newItem);

                        }
                    /* if(productList.contains(oldItem)){
                        int index = productList.indexOf(oldItem);
                        productList.set(index, newItem); */
                    }
                    int index = productList.indexOf(oldItem);

                    break;
                case "Rearrange":
                    String itemToRearrange = commandArr[1];

                    if (productList.contains(itemToRearrange)) {
                        productList.remove(itemToRearrange);
                        productList.add(itemToRearrange);

                    }
                    break;


            }
            inputLine = scan.nextLine();
        }
        System.out.println(String.join(" ", productList));

        for(String item : productList){
            System.out.print(item + ", ");  // Problem e che pechati zapetaya i prazno myasto
        }
    }
}
