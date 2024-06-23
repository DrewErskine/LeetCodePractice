package leetcode.stringReverseWords;

public class Solution {
    public String reverseWords(String s) {
        // Trim leading and ending spaces
        s = s.trim();

        // Split the string on one or more spaces
        String[] words = s.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        // Loop through the array of words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            // Add a space after each word except the last one
            if (i > 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
