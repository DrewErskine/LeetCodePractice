package leetcode.longestCommonPrefix;

class Solution {
    public int lengthOfLastWord(String s) {
        int largestWord = 0;
        String[] strArray = null;  
        strArray = s.split(" ");  

        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].length() > largestWord){
                largestWord = strArray[i].length();
            }
        }
        return largestWord;
    }
}