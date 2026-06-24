package org.example.Problems;

public class MinSizeSubArray {
    public int minSubArrayLen(int target, int[] nums) {
        int i= 0,j = 0;
        int sum =0;
        int n = nums.length;
        int result = 0;
        int length = n;

        while (i < n && j < n){
            if(nums[i] == target || nums[j] == target){
                return 1;
            }
            if(sum < target){
                sum = sum + nums[j];
                if(sum >= target && (j-i+1) <= length){
                    length = j-i+1;
                    continue;
                }
                j++;
            }else{
                if((j+1 -i) <= length){
                    result = j+1 -i;
                }
                sum = sum - nums[i];
                if(sum < target){
                    j++;
                }
                i++;
            }
        }
        System.out.println(result);
        return result;
    }

    public int minSubArrayLenSlide(int target, int[] nums) {
        int i= 0,j = 0;
        int sum =0;
        int n = nums.length;
        int length = n;

        for(j = 0; j<n; j++){
            sum = sum + nums[j];

            while(sum >= target){
                if((j-i+1) <= length){
                    length = j-i+1;
                }
                sum = sum - nums[i];
                i++;
            }
        }
        if(sum < target && (j-i) == n){
            length = 0;
        }
        System.out.println(length);
        return length;
    }
}
