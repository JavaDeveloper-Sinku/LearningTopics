package Learing;

public class clearDigite {

    public static void main(String[] args) {

        String s="abc2";


        System.out.println();
    }
    




        public String clearDigits(String s) {
            StringBuilder stk = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isDigit(c)) {
                    stk.deleteCharAt(stk.length() - 1);
                } else {
                    stk.append(c);
                }
            }
            return stk.toString();
        }

}
