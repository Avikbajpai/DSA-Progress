package org.example.Problems;

import java.util.HashMap;

public class LongesSubStrWORepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j;
        int length = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        char[] string = s.toCharArray();

        for(j = 0; j<string.length; j++){

            if(map.containsKey(string[j])){
                map.remove(string[i]);
                i++;
                j--;
                continue;
            }
            map.put(string[j],j);
            if((j + 1 - i) > length){
                length = j + 1 - i;
            }
        }
        System.out.println(length);
        return length;
    }
}
