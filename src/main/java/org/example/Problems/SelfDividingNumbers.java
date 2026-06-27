package org.example.Problems;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        int i;
        List<Integer> result = new ArrayList<>();
        for(i = left; i<= right; i++){
            boolean flag = true;
            int num = i;
            while(num > 0){
                int digit = num % 10;
                if(digit == 0 || (i % digit) !=0){
                    flag = false;
                    break;
                }
                num /=10;
            }
            if(flag){
                result.add(i);
            }
        }
        return result;
    }
}
