package org.example.Problems;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public int longestConsecutive(int[] nums) {
        // check in hashset for i -
        //      if i-1 exists count++ else i++

        HashSet<Integer> set = new HashSet<>();
        int i;
        int length = 0;
        int current = 0;
        for(i = 0; i < nums.length; i ++){
            set.add(nums[i]);
        }

        for(Integer num : set){
            int count = 1;
            current = num;
            if(set.contains(current - 1)){
                continue;
            }
            while(set.contains(current + 1)){
                count++;
                current = current + 1;
                //nums[i]++;
            }
            length = Math.max(length, count);
        }
        return length;
    }
}
