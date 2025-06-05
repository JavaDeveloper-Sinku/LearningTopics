package BigInteger;

import java.beans.BeanInfo;
import java.math.BigInteger;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        int a =30;
        int b = 37;

        Scanner sc= new Scanner(System.in);

        BigInteger A =  BigInteger.valueOf(33);
        BigInteger B = BigInteger.valueOf(320584053);
        BigInteger C = new BigInteger("50");
        BigInteger x = new BigInteger("50");




        //constants
        BigInteger D = BigInteger.TEN;

        //addition
        BigInteger s = C.add(x);

        System.out.println(s);


    }
}
