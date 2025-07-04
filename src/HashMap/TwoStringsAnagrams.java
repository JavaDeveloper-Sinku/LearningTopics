package HashMap;

import java.util.HashMap;

public class TwoStringsAnagrams {
    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1,s2)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }


    }

    public static boolean areAnagrams(String s1, String s2){
         if (s1.length() != s2.length()) return  false;

        HashMap<Character, Integer> map = new HashMap<>();


        //Count chars of s1
        for (char ch: s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0 ) + 1);
        }

        //subtract chars using s2
        for (char ch : s2.toCharArray()){
            if (!map.containsKey(ch)) return false;

            map.put(ch, map.get(ch) - 1);
            if (map.get(ch) < 0 ) return false;

        }
        return true;
    }
}
