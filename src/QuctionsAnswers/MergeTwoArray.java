package QuctionsAnswers;

import java.util.ArrayList;

public class MergeTwoArray {
    //nums1 = [[1,2],[2,3],[4,5]]
    //nums2 = [[1,4],[3,2],[4,1]]
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        ArrayList<int[]> res = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        int i = 0 ;
        int j = 0;

        while ( i < n && j < m){
            if (nums1[i][0] == nums2[j][0]){
                res.add(new int[]{nums1[i][0] , nums1[i][1] + nums2[j][1] });
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                res.add(new int[]{nums1[i][0] , nums1[i][1]});
                i++;

            }else {
                res.add(new int []{nums2[j][0] , nums2[j][1]});
                j++;
            }
        }
        while (i < n ){
            res.add(new int []{nums1[i][0] , nums1[i][0]});
            i++;
        }
        while (j < m){
            res.add(new int[]{nums2[j][0] , nums2[j][1] });
            j++;
        }
        int len = res.size();
        int result[][] = new int[len][2];
        for (int idx = 0 ; idx < len; idx++){
            result[idx] = res.get(idx);
        }
        return result;

    }
}


