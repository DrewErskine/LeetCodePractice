package leetcode.longestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longestPrefix = strs[0];

        for (int i = 0; i < longestPrefix.length(); i++) {
            char currentChar = longestPrefix.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                    return longestPrefix.substring(0, i);
                }
            }
        }

        return longestPrefix;
    }
}