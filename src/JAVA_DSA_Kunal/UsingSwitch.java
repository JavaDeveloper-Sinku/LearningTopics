package JAVA_DSA_Kunal;

import java.util.Scanner;

public class UsingSwitch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String name =sc.nextLine();

        switch (name) {
            case "Hello" -> System.out.println("this is first club");
            case "world" -> System.out.println(" second club");
            default -> System.out.println(" null ");
        }
    }
}
