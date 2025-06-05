package Array;

import java.util.Arrays;

public class PrefixSumExample {


    //method to build prefix sum array
    public static int [] buildPrefixSu(int [] arr){
        int [] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1 ; i< arr.length; i++){
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    //method to get sum from i to j using prefix sum

    public static int rangeSum(int [] prefixSum, int i , int j){
        if (i == 0){
            return prefixSum[j];
        }
        return prefixSum[j] - prefixSum[i - 1];
    }

    public static void main(String[] args) {
        int [] arr = {2,4,1,3,7};
        System.out.println(Arrays.toString(arr));

        int [] prefixSum = buildPrefixSu(arr);

        System.out.println(Arrays.toString(prefixSum));

        System.out.println("Sum ( 1 , 3 ) : " + rangeSum(prefixSum,1,3));

    }
}
