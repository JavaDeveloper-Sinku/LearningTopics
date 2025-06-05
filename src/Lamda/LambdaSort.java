package Lamda;

import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {

        List<String> name = Arrays.asList("Zara","Rishi","Yash","Java");

        //Traditional way Sorting
        System.out.println("---------------Traditional way---------------");
        System.out.println();
        Collections.sort(name, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println("Sorted with Traditional way : " + name);

        //lambda Expression way do
        System.out.println("---------------Lambda way---------------");
        System.out.println();

        Collections.sort(name, (a, b) -> a.compareTo(b));

        System.out.println("Sorted with lambda way : " + name);
    }
}
