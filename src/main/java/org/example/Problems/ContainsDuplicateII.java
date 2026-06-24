package org.example.Problems;

import java.util.HashMap;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(i = 0; i<nums.length; i++){
            int key = map.getOrDefault(nums[i], -1);
            if((key != -1) && Math.abs(nums[i] - key) <= k){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
