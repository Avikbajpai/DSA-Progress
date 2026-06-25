package org.example.Problems;

public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int i =0,
                j = 0;
        int result = 0;
        // {8,7,2,1}
        //  i
        //    j
        for(i = 0; i< height.length; i++){ //8
            int area = 0;
            for(j = i+1; j<height.length; j++){ //7, 2
                area = Math.min(height[i],height[j]) * (j-i); //7, 4
                System.out.println("i = " + i + " j = " + j + " area = " + area + " result = " + result);
                result = Math.max(area, result); // Max(7,0) = 7, max(4,7) = 7
            }
        }
        System.out.println(result);
        return result;
    }

    public int maxAreaOptimized(int[] height) {
        int i =height.length - 1,
                j = 0;
        int result = 0;
        // {8,7,2,1}
        //  i
        //    j
        while(j < i){
            int area = 0;
            area = Math.min(height[i],height[j]) * (i-j); //7, 4
            result = Math.max(area, result); // Max(7,0) = 7, max(4,7) = 7
            if(height[i] > height[j]){
                j++;
            }else{
                i--;
            }
        }
        System.out.println(result);
        return result;
    }
}
