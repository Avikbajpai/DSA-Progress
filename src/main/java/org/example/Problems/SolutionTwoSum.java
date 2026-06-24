package org.example.Problems;

import java.util.HashMap;

public class SolutionTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap();
        for(i=0; i<= nums.length - 1; i++){
            result = target - nums[i];
            if(map.containsKey(result)){
                int []arr = new int[2];
                arr[0] = (int)map.get(result);
                arr[1] = i;
                return arr;
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[2];
    }
}