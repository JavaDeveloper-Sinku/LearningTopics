package Array;


//Max Sum Subarray ( Kadane's Algorithms )

public class MaxSumSubarray {
    public static void main(String[] args) {
        int [] arr= {1,2,4,3,5,3};

        System.out.println(maxSumSubarray(arr));
    }
    public static int maxSumSubarray(int [] arr){
        if (arr.length == 0 ){
            return -1;

        }
        int maxSum = arr[0];
        int currSum = arr[0];

        for (int i =1 ; i < arr.length; i++){
            currSum = Math.max(arr[i] , currSum + arr[i]);

            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
    }
}
