package HashMap;



//Count Subarrays With Given Sum

import java.util.HashMap;

public class CountsSubArryasSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;

        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // very important - handles the case when prefixSum == k
        map.put(0, 1);

        for (int num : arr){
            prefixSum += num;

            if (map.containsKey(prefixSum - target)){
                count += map.get(prefixSum - target);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);

        }

        System.out.println("Count of subarrays with sum " + " is : " + count);
    }

}
