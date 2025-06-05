package JAVA_DSA_Kunal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort_Algo {
    public static void main(String[] args) {
        int[] arr = {4,5,2,6,4,2};
        countSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("CountSortHas");

        countSortHas(arr);
        System.out.println(Arrays.toString(arr));



    }

    //Count Sort Algo there is
    public static void countSort(int [] arr){

        //Base Conditions of giving array
        if (arr == null || arr.length <=1){
            return;
        }


        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }

        int[] countarry = new int[max + 1];
        for (int num : arr){
            countarry[num]++;
        }
        int index = 0 ;
        for (int i = 0; i<= max ; i++){
            while (countarry[i] > 0){
                arr[index] = i;
                index++;
                countarry[i]--;
            }
        }
    }

    //countSort_HashValue

    public static void countSortHas(int[] arr){
        if (arr == null || arr.length <= 1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int min= Arrays.stream(arr).min().getAsInt();

        Map<Integer,Integer> countMap = new HashMap<>();

        for (int num : arr){
            countMap.put(num,countMap.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = min ; i<= max; i++){
            int count = countMap.getOrDefault(i , 0);
            for (int j =0 ; j< count; j ++){
                arr[index] = i;
                index++;
            }
        }



    }


}
