package LE25_Exercise_Associative_Arrays;

import java.util.*;

public class P09_forceBook_FIX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<String, List<String>> users = new LinkedHashMap<>();

        String line = scan.nextLine();

        while(!line.equals("Lumpawaroo")){
            if(line.contains("|")){
                String [] data = line.split("\\s+\\|\\s+");
                String side = data[0];
                String userName = data[1];
                users.putIfAbsent(side, new ArrayList<>());

                boolean noneMatch = users.entrySet().stream().noneMatch(entry -> entry.getValue().contains(userName));

                if(noneMatch){
                    users.get(side).add(userName);
                }


            } else if (line.contains("->")){
                String [] data = line.split("\\s+->\\s+");
                String side = data[1];
                String userName = data[0];

                users.forEach((k, v) -> v.remove(userName));
                users.putIfAbsent(side, new ArrayList<>());
                users.get(side).add(userName);
                System.out.printf("%s joins the %s side!%n", userName, side);

            }



            line = scan.nextLine();
        }

        users.forEach((k, v) -> {
            if(v.size() != 0){
                System.out.printf("Side: %s, Members: %d%n", k, v.size());
                v.forEach(user -> System.out.printf("! %s%n", user));
            }
        });
    }
}
