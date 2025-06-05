package StriversSheetDSA.BasicMaths;

public class CheckPalindrome {
    public static void main(String[] args) {

        int n = 121;

        System.out.println(Check(n));
    }

    static int Check(int n){

        int rnum=0;
        int n2 =0 ;

        while (n > 0){

            int ld= n % 10;
            rnum = (rnum * 10) +ld;
            n = n / 10;
        }
        if (n2 ==  rnum) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        return rnum;
    }
}
