package easy;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;
        if (s.length() == 0)
            return true;

        HashMap<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            letters.put(c, letters.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char current = t.charAt(i);
            if (letters.containsKey(current) && letters.get(current) > 0) {
                letters.put(current, letters.get(current) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
