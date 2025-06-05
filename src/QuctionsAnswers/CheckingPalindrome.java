package QuctionsAnswers;

public class CheckingPalindrome {
    public static void main(String[] args) {

        int num = 121;

        System.out.println(checkingpalindrome(num));
    }

    public static boolean checkingpalindrome(int num) {

        //base condition
        if (num < 0) {
            return false;
        }

        //converting value integer to String
        String s = String.valueOf(num);

        //two pointers
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}
