package org.example.Problems;

public class TrappingRainWater {

    public int trap(int[] height) {
        int i;
        //Step 1 - iterate array
        //Step 2 - leftMax, rightMax
        //Step 3 - water --> min(leftMax,rightMax) - height of current Index
        //Brute Force
        int[] rightMaxArray = new int[height.length];
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;
        for(int r = height.length - 1; r >= 0; r--){
            //store rightMax in array
            rightMax = Math.max(rightMax, height[r]);
            rightMaxArray[r] = rightMax;
        }

        for(i = 0; i< height.length; i++){
            int left = 0;
            left = height[Math.max(i-1,0)];
            leftMax = Math.max(leftMax,left);
            rightMax = rightMaxArray[i];

            //calculate water
            if(Math.min(rightMax, leftMax) - height[i] >= 0){
                water = water + (Math.min(rightMax, leftMax) - height[i]);
            }
        }
        System.out.println(water);
        return water;
    }
}
