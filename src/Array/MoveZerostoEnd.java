package Array;

import java.util.Arrays;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int [] arr = {30,0,0,0,04,3,60,0,42,0};
        System.out.println(Arrays.toString(arr));
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int [] arr){
        int insertPosition = 0 ;

        //first all Value are putting one side of array
        for (int num : arr){
            if (num != 0){
                arr[insertPosition++] = num;
            }
        }
        //Second all the empty place filling  zero's  inside the  array
        while (insertPosition < arr.length){
            arr[insertPosition++] = 0;
        }
    }
}
