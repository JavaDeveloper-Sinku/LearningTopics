package Learing;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        maxheap.add(21);
        maxheap.add(1);
        maxheap.add(45);

        while (!maxheap.isEmpty()){
            System.out.println(maxheap.poll());
        }
    }
}
