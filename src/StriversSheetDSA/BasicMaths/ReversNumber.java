package StriversSheetDSA.BasicMaths;

public class ReversNumber {
    public static void main(String[] args) {

        int num = 12345;

        System.out.println(ReversNumber(num));

    }
    static int  ReversNumber(int num){
        int  revNum = 0;

        while ( num > 0){
            int id = num % 10;
            revNum = (revNum * 10)  + id;

            num = num / 10;

        }
        return revNum;

    }
}
