package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("name num : ");
        int num = in.nextInt();


        Map<String , Integer> Phonebook = new HashMap<>();

        for (int i =0 ; i < num ; i++ ){
            System.out.print("name place : ");
            String name  = in.next();
            System.out.print("name phone : ");
            Integer phone = in.nextInt();
            Phonebook.put(name, phone);
        }

        while (in.hasNext()){
            String queryName  = in.next();

            if (Phonebook.containsKey(queryName)){
                int PhoneNumber = Phonebook.get(queryName);
                System.out.println(queryName = " = " + PhoneNumber);
            }else {
                System.out.println("Not found");
            }
        }
        in.close();


    }
}
