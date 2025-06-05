package StriversSheetDSA.Pattern;

import java.util.Scanner;

public class Patteern2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value: ");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);  ///changing only  i and j //
            }
            System.out.println();
        }
    }
}
