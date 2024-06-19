package leetcode.lengthLargestWord;

class Solution {
    public int lengthOfLargestWord(String s) {
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