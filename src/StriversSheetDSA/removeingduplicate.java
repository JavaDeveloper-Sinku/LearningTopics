package StriversSheetDSA;

public class removeingduplicate {
    public static void main(String[] args) {
        int num[] ={1,1,1,1,2,2,2,2};

       int val = removeValue(num);
        System.out.println(val);


        largeValue(num);

    }
    public static int removeValue(int []num){
        int i= 0;
        for (int j= 1;j<num.length;j++ ){

            if (num[i] != num[j]){
                i++;
                num[i] =num[j];
            }
    }
        return i+1;
  }

  public static int largeValue(int [] arr){
        int largeValue= 0;

        for (int i=0; i<arr.length;i++) {
            if (arr[i] > largeValue) {
                largeValue = arr[i];
            }
        }
return largeValue;

  }



}
