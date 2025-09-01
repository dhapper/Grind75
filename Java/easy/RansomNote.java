package easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> noteMap = new HashMap<>();
        HashMap<Character, Integer> magMap = new HashMap<>();

        for(int i = 0; i < ransomNote.length(); i++ ){
            char letter = ransomNote.charAt(i);
            if(noteMap.containsKey(letter))
                noteMap.put(letter, noteMap.get(letter) + 1);
            else
                noteMap.put(letter, 1);
        }

        for(int i = 0; i < magazine.length(); i++ ){
            char letter = magazine.charAt(i);
            if(magMap.containsKey(letter))
                magMap.put(letter, magMap.get(letter) + 1);
            else
                magMap.put(letter, 1);
        }

        for (Map.Entry<Character, Integer> noteEntry : noteMap.entrySet()) {
            Character key = noteEntry.getKey();

            if(!magMap.containsKey(key)) { return false; }
            else if (magMap.get(key) < noteMap.get(key)) { return false; }
        }

        return true;
    }
}
