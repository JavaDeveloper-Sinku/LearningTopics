package QuctionsAnswers;

import java.util.ArrayList;
import java.util.List;

public class findingAllSubarray {
    public static void main(String[] args) {

//Bitwise AND operation (n & 1)
//
//Even numbers ka binary representation last bit 0 hota hai (e.g., 8 → 1000, 6 → 0110).
//Odd numbers ka binary representation last bit 1 hota hai (e.g., 7 → 0111, 3 → 0011).
//n & 1 se sirf last bit check hoti hai. Agar result 0 hai, to number even hai, warna odd hai.


        int n = 10;

        System.out.println((n & 1) == 0 ? "Even" : "Odd");


    }




    public static List<List<Integer>> findingAllSubarray(int []arr){
        int n = arr.length;

        List<List<Integer>> subarrays = new ArrayList<>();

        for (int start = 0 ; start < n ; start++){
            for (int end = start; end < n ; end++);
            List<Integer> subarray = new ArrayList<>();
            int end;
//            for (int k = start; k <= end; k++){
//                subarray.add(arr[k]);
//            }k
            subarrays.add(subarray);

        }
        return subarrays;

    }

}
