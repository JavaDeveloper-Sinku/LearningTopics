package Array;

import java.util.Arrays;


//Two Pointer Using there
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        System.out.println("Before : " +Arrays.toString(arr));
        revers(arr);
        System.out.println("After : "+ Arrays.toString(arr));

    }
    public static void revers(int[] arr) {
        if (arr.length == 0) {
            return;
        }

        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
