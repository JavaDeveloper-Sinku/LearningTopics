package Learing;

import java.util.ArrayList;
import java.util.List;

public class SubSetProblems {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();

        generateSubsets(arr, 0 ,new ArrayList<>(),result);

        System.out.println("Subsets : " + result);

    }

    public static void generateSubsets(int[] arr, int index , List<Integer> current,List<List<Integer>> result){

        if (index == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        generateSubsets(arr,index+ 1,current,result);

        current.add(arr[index] );
        generateSubsets(arr,index+1, current,result);

        current.remove(current.size() - 1);
    }
}
