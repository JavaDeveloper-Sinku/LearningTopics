package A_Own_DSA_Sheet;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {

    }
    public static int longestConsecutive(int [] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);

            int maxLength = 0;
            for (int numss : set) {
                if (set.contains(numss - 1)) {
                    int curr = numss;
                    int streak = 1;
                    while (set.contains(curr + 1)) {
                        curr++;
                        streak++;

                    }
                    maxLength = Math.max(maxLength, streak);
                }
            }
            return maxLength;
        }

        return -1;
    }
}
