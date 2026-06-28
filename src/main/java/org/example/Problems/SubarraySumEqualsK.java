package org.example.Problems;

import java.util.HashMap;

public class SubarraySumEqualsK {

    public int subarraySum(int[] nums, int k) {
        //sum = sum + nums[i]
        // if sum == k
        //      map.put(k, count++)
        //      sum = 0

        int i = 0;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j = 0; j < nums.length; j++){
            sum = sum + nums[j];
            if(map.containsKey(sum - k)){
                count = count + map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
