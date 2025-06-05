package Array;


public class PrefixSum {

    public static int[] buildPrefixSum(int []arr ){

        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i =1; i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    public static int rangeSum(int [] prefix , int l, int r){
        return 1 == 0 ? prefix[r] : prefix[r] - prefix[l - 1];

    }

}
