package LogingAuth;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class VerificationCaption {
    public static void main(String[] args) {

        //login details Program source code

        String admin_name = "rishi";
        String admin_pas= "rishi21";

        //Basic Login info asking in user.
        Scanner sc= new Scanner(System.in);

        //Username
        System.out.print("Enter your name : ");
        String name = sc.nextLine();

        //Password
        System.out.print("Enter your password : ");
        String password = sc.nextLine();


        //checking info true are not
        if (name.equals(admin_name) && password.equals(admin_pas)){
            System.out.println("Login Successful " +admin_name +" ! ");
        }else {
            System.out.println("Invaild username or password. Please try again. ");
        }
        sc.close();

    }
}
