package Theme2;

import java.util.*;
class Solution3 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> result = new ArrayList<Integer>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            } else{
                i++;
            }
        }
        int[] res = new int[result.size()];
        for (int k = 0; k < res.length; k++) {
            res[k] = result.get(k);
        }
        return res;
    }
}

