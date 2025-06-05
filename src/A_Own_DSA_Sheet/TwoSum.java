package A_Own_DSA_Sheet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        int target = 7;
      int []ans = findTwosum(arr , target);
        System.out.println(Arrays.toString(ans));

    }
    public static int [] findTwosum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0; i<nums.length;i++){

            int diff = target - nums[i];
            if (map.containsKey(diff)){
                return new int[]{ map.get(diff), i };
            }
            map.put(nums[i], i );
        }
        return new int[]{-1 , -1};
    }
}
