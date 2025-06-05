package LogingAuth;

import java.util.HashMap;
import java.util.Scanner;

public class Singup {
    public static void main(String[] args) {
        //Sing_up code

        //Store user credentials in a hashmap
        HashMap<String, String> users = new HashMap<>();


        //choice var temp number saving
        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to the System");
        while (true) {
            System.out.println("Chose an option");
            System.out.println("1. Sign Up");
            System.out.println("2. log In");

            int choice = sc.nextInt();
            sc.nextLine(); //Consume new line

            //1
            if (choice == 1) {
                //sign-up process
                System.out.println("Enter a  username : ");
                String newUsername = sc.nextLine();

                if (users.containsKey(newUsername)) {
                    System.out.println("Username already exists. try a different one. ");

                } else {
                    System.out.print("Enter a new Password:");
                    String newPassword = sc.nextLine();
                    users.put(newUsername, newPassword);
                    System.out.println("Sing-up successful! you can now log in. ");

                }
            } else if (choice == 2) {
                //Log-in process
                System.out.println("Enter username: ");
                String enterdUsername = sc.nextLine();

                System.out.println("Enter password: ");
                String enterdpassword = sc.nextLine();

                if (users.containsKey(enterdUsername) && users.get(enterdUsername).equals(enterdpassword)) {
                    System.out.println("login successful ! Welcome " + enterdUsername + " !");

                } else {
                    System.out.println("Invalid info ! try again");
                }
            }
            sc.close();
        }

    }
}
