package StriversSheetDSA.BasicMaths;

public class CountDigits {
    public static void main(String[] args) {

        int n = 236665554;
        System.out.println(count(n));


    }
    static int count(int n){
        int count = 0;
        while (n>0){
//            int lastdigit = n % 10;
            count =count+1;

            n = n /10;

        }
       return count;
    }
}
