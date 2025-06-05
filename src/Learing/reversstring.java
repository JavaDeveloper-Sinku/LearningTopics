package Learing;

import java.util.Arrays;

public class reversstring {
    public static void main(String[] args) {

        String name = "rishi singh ";

        String revers = new StringBuilder(name).reverse().toString();



        System.out.println(revers);

String re =" " ;
        for (int i= name.length()-1; i>= 0 ;i--){
            re += name.charAt(i);
        }
        System.out.println(re);
    }
    
}
