package leetcode.zigZag;

public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int cycle = 2 * numRows - 2;

        for (int i = 0; i < s.length(); i++) {
            int row = i % cycle;
            if (row >= numRows) {
                row = cycle - row;
            }
            rows[row].append(s.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
