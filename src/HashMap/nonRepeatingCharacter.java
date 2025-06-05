package HashMap;

import java.util.HashMap;

public class nonRepeatingCharacter {
    public static void main(String[] args) {

       String str= "aabccdb";

        HashMap<Character, Integer> map = new HashMap<>();

        //Step 1: Count frequency of each character
        for (char ch : str.toCharArray()){
            map.put( ch ,  map.getOrDefault(ch,0)+1);

        }

        //step 2: Find first character with frequency = 1
        for (char ch : str.toCharArray()){
            if (map.get(ch) == 1){
                System.out.println("First non-repeating character is : " + ch);
                return;
            }
        }

    }
}
