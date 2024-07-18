package leetcode.ransom;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> charToIntegerMap = new HashMap<>();

        for(int count = 0; count < magazine.length(); count++){
            char c = magazine.charAt(count);
            charToIntegerMap.put(c, charToIntegerMap.getOrDefault(c, 0) + 1);
        }

        for (int count = 0; count < ransomNote.length(); count++) {
            char c = ransomNote.charAt(count);
            if (charToIntegerMap.getOrDefault(c, 0) <= 0) {
                return false;
            }
            charToIntegerMap.put(c, charToIntegerMap.get(c) - 1);
        }

        return true;
    }
}
