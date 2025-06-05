package Learing;

import java.util.Arrays;
import java.util.List;



public class arr {
    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 5, 3, 2};
        int num[] = {4, 2, 4, 2};
//        System.out.println(num[0]);
//        System.out.println(Arrays.toString(num));
//
//        System.out.println(maxSubArray(arr));


//    }

        int[] prices = {7, 3, 1, 4, 2, 1};

        System.out.println(maxProfit(prices));
    }

//max Sub array problem
        public static int maxSubArray(int[] nums) {
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int num : nums) {
                currSum += num;
                if (currSum < num) {
                    currSum = num;
                }
                maxSum = Math.max(maxSum, currSum);
            }
            return maxSum;
        }


//Stock buy and sell Problem
        public  static int maxProfit(int[] prices) {



            int minPrice = Integer.MAX_VALUE; //buying
            int maxProfit = 0;

            for(int i = 0; i<prices.length ; i++){
                if(prices[i] < minPrice){
                    minPrice = prices[i];
                }
                else if(prices[i] - minPrice > maxProfit ) {
                    maxProfit = prices[i] - minPrice;

                }
            }
            return maxProfit;

        }

}
