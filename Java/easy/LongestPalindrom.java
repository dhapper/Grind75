package easy;

import java.util.HashMap;

public class LongestPalindrom {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + 1);
            }else{
                map.put(key, 1);
            }
        }

        int length = 0;
        boolean middleCharAdded = false;
        for(Character key : map.keySet()){
            if(!middleCharAdded && map.get(key) % 2 == 1){
                length++;
                middleCharAdded = true;
            }
            int value = map.get(key);
            length += value % 2 == 0 ? value : value - 1;
        }
        return length;
    }
}
