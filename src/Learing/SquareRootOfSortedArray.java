package Learing;

import javax.lang.model.util.Elements;
import java.util.Arrays;

public class SquareRootOfSortedArray {
    public static int[] sortedSquares(int []arr){

        int n = arr.length;
        int [] result = new int[n];

        //Two pointer
        int head = 0;
        int tail = n -1;
        int index = n -1;


        while (head <= tail){
            int leftSquare = arr[head] * arr[head];
            int rightSquare = arr[tail] * arr[tail];


            if (leftSquare > rightSquare){
                result[index] = leftSquare;
                head++;
            }else {
                result[tail] = rightSquare;
                tail--;
            }
            index--;

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};

        int [] result = sortedSquares(arr);


        System.out.println("Old Array :"+ Arrays.toString(arr));

        System.out.println(Arrays.toString(result));
    }
}
