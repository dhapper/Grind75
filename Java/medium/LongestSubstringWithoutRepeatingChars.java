package medium;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LongestSubstringWithoutRepeatingChars {
    // uses set.size() instead of lengthCounter for faster runtime
    // note comments affect runtime

    public int lengthOfLongestSubstring(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        // int lengthCounter = 0;
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++){

            char current = s.charAt(i);
            if(set.contains(current)){

                Iterator<Character> it = set.iterator();
                while(it.hasNext()){
                    char value = it.next();
                    it.remove();
                    // lengthCounter--;
                    if(value == current)
                        break;
                }

                set.add(current);
                // lengthCounter++;
            }else{
                set.add(current);
                // lengthCounter++;
            }

            maxLength = Math.max(set.size(), maxLength);
            // System.out.println(set);
            // System.out.println(set.size()+" | "+maxLength);
            // System.out.println();
        }
        return maxLength;        
    }
}
