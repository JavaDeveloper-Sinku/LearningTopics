package Learing;

import java.util.ArrayList;
import java.util.Scanner;

public class csw_ArrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>(5);

        System.out.println(" add the values : ");

        for (int i =0;i<5;i++){
            list.add(in.nextInt());

        }
        System.out.println(list);
    }
}
