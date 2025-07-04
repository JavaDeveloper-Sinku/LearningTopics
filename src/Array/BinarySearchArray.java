package Array;

public class BinarySearchArray {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7};

        int target = 4;
        System.out.println(btSearch(arr, target));
    }
    public static int btSearch(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start +(end - start) /2 ;
            if (arr[mid]  == target){
                return mid;

            } else if (arr[mid] < target) {
                start = mid +1 ;
            }else {
                end = mid -1;
            }
        }
        return -1;
    }
}
