package HashMap;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String , List<String>> map = new HashMap<>();

        for (String word : words){
            //step 1 sort the word
            char[] chars =word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);  //this is key


            //step 2 add to map
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());

            }
            map.get(sorted).add(word);
        }
        //step 3 print grouped anagrams
        System.out.println("Grouped Anagrams : ");
        for (List<String> group : map.values()){
            System.out.println(group);
        }

    }
}
