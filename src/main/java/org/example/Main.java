package org.example;

import org.example.Problems.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//
//        int[] nums = {2,7,11,15};
//        int target = 9;
//        SolutionTwoSum test =  new SolutionTwoSum();
//        int[] ints = test.twoSum(nums, target);

//        Anagram anagram = new Anagram();
//        anagram.isAnagram("anagram", "nagaram");

//        int [][] mat = {{0,1,0},{0,0,0},{1,0,0}, {1,0,0}};
//        int [][] mat = {{1,0,0}, {0,0,1}, {1,0,0}};
//        int[] array = {2,3,1,2,4,3};
        //int[] array = {5,1,3,5,10,7,4,9,2,8};
//        int[] array = {1,2,3,4,5};
//        int[] array = {1,1,1,1,1,1,1,1};
//        SpecialPositionInBinaryMatrix matrix = new SpecialPositionInBinaryMatrix();
//        matrix.numSpecialOp(mat);
//        MinSizeSubArray minSizeSubArray = new MinSizeSubArray();
//        minSizeSubArray.minSubArrayLenSlide(11, array);
//        int [][] mat = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
//        NumMatrix numMatrix = new NumMatrix(mat);
//        numMatrix.sumRegionAgain(2,1,4,3);
//        numMatrix.sumRegionAgain(1,1,2,2);
//        numMatrix.sumRegionAgain(1,2,2,4);

//        LongesSubStrWORepeatingChar obj = new LongesSubStrWORepeatingChar();
//        obj.lengthOfLongestSubstring("aab");

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
//        ContainerWithMostWater  container = new ContainerWithMostWater();
//        container.maxAreaOptimized(height);
        TrappingRainWater  trappingRainWater = new TrappingRainWater();
        trappingRainWater.trap(height);
    }
}