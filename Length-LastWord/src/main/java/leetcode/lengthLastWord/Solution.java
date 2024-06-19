package leetcode.lengthLastWord;

/*class Solution {
    public int lengthOfLastWord(String s) {
        String[] tokens = s.split(" ");
        String lastWord = tokens[tokens.length - 1];
        return lastWord.length();
    }
}*/

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i --) {
            if (s.charAt(i) != ' ') length ++;
            else break;
        }
        return length;
    }
}