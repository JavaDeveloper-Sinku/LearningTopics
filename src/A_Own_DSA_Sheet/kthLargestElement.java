package A_Own_DSA_Sheet;

import java.util.PriorityQueue;

public class kthLargestElement {
    public static int findkthLargest(int [] nums , int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for (int num : nums){
            minheap.offer(num);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }
        return minheap.peek();
    }
}
