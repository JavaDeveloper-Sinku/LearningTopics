package Learing;


//leetcode 1910  mid-level problem //
public class subStringproblems {

    public static void main(String[] args) {

        String s = "daabcbaabcbc";
        String part = "abc";

        System.out.println(removeOccurrences(s,part));


    }

        static public String removeOccurrences(String s, String part) {
            while (s.contains(part)) {
                s = s.replaceFirst(part, "");
            }
            return s;
        }

}
