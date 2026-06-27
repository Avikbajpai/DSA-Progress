package org.example.Problems;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int i;
        int[] suffixProduct = new int [nums.length];
        int [] result = new int [nums.length];
        int product = 1;
        suffixProduct[nums.length - 1] = 1;

        for(i = nums.length - 2; i >= 0; i--){
            product = product * nums[i+1];
            suffixProduct[i] = product;
        }
        int leftProduct = 1;
        int rightProduct = 1;
        for(i = 0; i<nums.length; i++){

            leftProduct = (i == 0) ? 1 : leftProduct * nums[i - 1];
            rightProduct = suffixProduct[i];
            result[i] = leftProduct * rightProduct;
        }

        return result;
    }
}
