package HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> num= new HashSet<>();
       


        set.add(1);
        set.add(2);
        set.add(3);

        if (set.contains(1)){
            System.out.println( "hi");
        }else {
            System.out.println("no");
        }

        System.out.println( "set size :"+ set.size());
        System.out.println(set);

        Iterator it =set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}
