package JAVA_DSA_Kunal;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        int [][] arr= new int[3][3];
        System.out.println(" size of the array :"+arr.length);

        //input value's loop

        for (int row =0; row < arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        //output of the loops
        for (int row =0; row < arr.length;row++){

                System.out.println(Arrays.toString(arr[row]));
            }
            System.out.println();
        }





    }

