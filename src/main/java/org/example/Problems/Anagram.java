package org.example.Problems;

import java.util.HashMap;

public class Anagram {
    public boolean isAnagram(String s, String t) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(start);
        int i,j = 0;
        System.out.println();
        HashMap<Character, Integer> mapS = new HashMap();
        //HashMap<Character, Integer> mapT = new HashMap();
        int count = 1;
        if(s.length() != t.length()){
            return false;
        }
        for(i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            //mapS.put(c, i);
            if(mapS.containsKey(c)){
                count = mapS.get(c);
                mapS.put(c, ++count);
            }else {
                mapS.put(c, 1);
            }
        }
        for(j = 0; j<t.length(); j++){
            char c = t.charAt(j);
            if(mapS.get(c) == null){
                continue;
            }
            if(mapS.get(c) != 0){
                count = mapS.get(c);
                mapS.put(c, --count);
                if(count == 0){
                    mapS.remove(c);
                }
            }
        }
        if(mapS.size() != 0){
            long end = System.currentTimeMillis();
            System.out.println(end);
            System.out.println("time taken : " + (end - start) + "result = false");
            return false;
        }
        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("time taken : " + (end - start) + "result = true");
        return true;
    }
}
