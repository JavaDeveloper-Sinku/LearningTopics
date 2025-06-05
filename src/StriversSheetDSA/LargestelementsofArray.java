package StriversSheetDSA;
//Largest element of array
public class LargestelementsofArray {
    public static void main(String[] args) {

        int largest = 0;
        int num[] ={2,4,3,7,1,5};

        for (int i=0; i<num.length;i++){
            if (largest < num[i]){
                largest = num[i];
            }
        }
        System.out.println(largest);
    }
}
