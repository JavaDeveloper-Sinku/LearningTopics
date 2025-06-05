package HashMap;




//Longest Substring Without Repeating Characters

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength =  0;
        int start = 0 ;

        for(int end = 0 ; end < s.length(); end++){
            char ch = s.charAt(end);

            if (map.containsKey(ch)){
                //update start to max of previous start or last repeated index + 1
                start = Math.max(start, map.get(ch) + 1);

            }
            //update the latest index of the current character
            map.put(ch,end);

            //update maxLength
            maxLength = Math.max(maxLength, end - start  + 1 );


        }
        System.out.println( "Longest unique substring length is :  "+ maxLength);
    }


}
