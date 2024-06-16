package leetcode.romanToInt;
public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int length = s.length();

        for(int i = 0; i < length; i++){
            char current = s.charAt(i);
            char next = ' ';
            if(i + 1 < length){
                next = s.charAt(i + 1);
            }

            switch (current) {
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'C':
                    if (next == 'M' || next == 'D') {
                        sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'X':
                    if (next == 'C' || next == 'L') {
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    if (next == 'X' || next == 'V') {
                        sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                default:
                    // invalid char
                    return 0;
            }
        }

        return sum;
    }
}