package Learing;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        minheap.add(21);
        minheap.add(23);

        while (!minheap.isEmpty()){
            System.out.println(minheap.poll());
        }
    }
}
