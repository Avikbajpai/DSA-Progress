package org.example.Problems;

public class SubArraysSizeKAndAvgGreater {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i,
                j = 0;
        int count = 0;
        int sum = 0;

        for(i = 0; i < arr.length; i++){

            if(j == 0){
                while(j-i+1 <= k){
                    sum = sum + arr[j];
                    j++;
                }
                j--;

            }
            if(i > 0 && i <= arr.length - k){
                sum = sum - arr[i-1] + arr[j];
            }
            if(sum < k * threshold){
                //window invalid --> move i and j
                j++;
                continue;
            }
            //valid window
            count = count + 1;
            if(j == arr.length -1){
                break;
            }
            j++;
        }
        System.out.println(count);
        return count;
    }

    public int numOfSubarraysOps(int[] arr, int k, int threshold) {
        int i,
                j = 0;
        int count = 0;
        int sum = 0;
        for(i = 0; i<k;i++){
            sum = sum + arr[i];
        }
        if(sum >= threshold * k){
            count++;
        }
        i =0;
        j = k;
        while(j < arr.length){
            sum = sum + arr[j] - arr[i];
            if(sum >= threshold * k){
                count++;
            }
            i++;
            j++;
        }
        //System.out.println(count);
        return count;
    }
}
