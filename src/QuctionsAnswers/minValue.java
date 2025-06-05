package QuctionsAnswers;

public class minValue {

    public static void main(String[] args) {
        int [] arr = { 2 ,3,1};

        System.out.println(findingminValue(arr));


    }
    public static int findingminValue(int [ ] arr){
        if (arr == null || arr.length == 0){
            return 0;
        }

        int minValue = arr[0];
        for (int i = 1 ; i< arr.length;i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }
}
