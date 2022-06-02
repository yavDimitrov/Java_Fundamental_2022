package LE25_Exercise_Associative_Arrays;

import java.util.*;

public class P08_companyUsers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> employeeList = new LinkedHashMap<>();
        String line = scan.nextLine();

        while (!line.equals("End")) {
            String[] input = line.split("\\s+->\\s+");
            String company = input[0];
            String employeeID = input[1];

            if (employeeList.containsKey(company)) {
               boolean nonMatch = employeeList.get(company).stream().noneMatch(el -> el.contains(employeeID));
               if(nonMatch){
                   employeeList.get(company).add(employeeID);

                }

            } else {
                employeeList.put(company, new ArrayList<>());
                employeeList.get(company).add(employeeID);

            }


            line = scan.nextLine();
        }
        employeeList.forEach((k, v) -> {
            System.out.printf("%s%n", k);
            v.forEach(el -> System.out.printf("-- %s%n", el));
        });
    }
}
