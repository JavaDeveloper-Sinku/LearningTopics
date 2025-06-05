package QuctionsAnswers;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Original Array");
        int [] arr = {3,2,3};
        System.out.println(Arrays.toString(arr));

        System.out.println("majorityElement");
        System.out.println(majorityelement(arr));


    }
    public static int majorityelement(int arr[]){

        Map<Integer,Integer> count = new HashMap<>();
        int majorityCount = arr.length / 2 ;

        for (int num: arr){
            count.put(num,count.getOrDefault(num,0) + 1);
            if (count.get(num) > majorityCount){
                return num;
            }
        }
        return -1;

    }

}
