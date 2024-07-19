package leetcode.wordPattern;

import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> patternMap = new HashMap<>();

        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (patternMap.containsKey(c)) {

                if (!patternMap.get(c).equals(word)) {
                    return false;
                }
            }
            else {
                if (patternMap.containsValue(word)) {
                    return false;
                }
                patternMap.put(c, word);
            }
        }

        return true;
    }
}