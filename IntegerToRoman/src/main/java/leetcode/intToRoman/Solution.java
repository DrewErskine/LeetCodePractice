package leetcode.intToRoman;

public class Solution {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        
        // Define the Roman numeral symbols and their corresponding integer values
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        // Convert the integer to a Roman numeral
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                s.append(symbols[i]);
            }
        }

        return s.toString();
    }
}
