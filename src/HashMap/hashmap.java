package HashMap;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,2);


        System.out.println(map.get(1));
        System.out.println(map.get(4));

        for (Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println("key");
            System.out.println(e.getKey());
            System.out.println("Value");
            System.out.println(e.getValue());
        }
    }
}
