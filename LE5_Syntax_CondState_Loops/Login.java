package LE5_Syntax_CondState_Loops;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = "";
        int count =0;
        String input;

        for(int i = username.length()-1; i >= 0; i--){
            password += username.charAt(i);
        }

        input = scan.nextLine();
        while (count <= 4){
            count ++;

            if(password.equals(input)){
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                if(count == 4) {
                    System.out.printf("User %s blocked!", username);
                    break;
                } else {
                    System.out.println("Incorrect password. Try again.");
                    input = scan.nextLine();
                }
            }
        }
    }
}
