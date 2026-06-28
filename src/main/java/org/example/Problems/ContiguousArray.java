package org.example.Problems;

import java.util.HashMap;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int i = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int result = 0;
        int sum = 0;
        int current = 0;
        int length = 0;
        map.put(0, -1);
        for(i = 0; i < nums.length; i++){
            current = nums[i] == 0 ? -1 : nums[i];
            sum = sum + current;
            if(map.containsKey(sum)){
                length = i - map.get(sum);
                result = Math.max(length, result);
            }else{
                map.put(sum, i);
            }
        }
        return result;
    }
}
