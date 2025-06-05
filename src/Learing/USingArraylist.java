package Learing;

import java.util.ArrayList;
import java.util.List;

public class USingArraylist {
    public static void main(String[] args) {

        List<Integer> nums  =new ArrayList<>();

        //adding
        nums.add(2);
        nums.add(3);
        nums.add(5);

        //retrieving
        System.out.println(nums.get(0));

        //indexed for loop iteration
        for (int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }
        nums.remove(nums.size() -1);
        nums.remove(0);

        for (Integer value: nums){
            System.out.println(value);
        }
    }
}
