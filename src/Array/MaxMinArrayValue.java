package Array;

public class MaxMinArrayValue {
    public static void main(String[] args) {

        int [] arr= {1,2,3,43,7,4,30};
        System.out.println(maxValue(arr));
        System.out.println(minValue(arr));
    }



    //Max Value method
    public static int maxValue(int [] arr) {
        if (arr.length == 0 ){
            return -1;
        }
        int max = arr[0];
        for (int num : arr){
            if (num > max) {
                max = num;

            }
        }
        return max;
    }
    //Min Value method
    public static int minValue(int [] arr){
        if (arr.length == 0 ){
            return  -1;
        }
        int min = arr[0];
        for (int num : arr){
            if (num < min){
                min = num;
            }
        }
        return min;
    }
}
