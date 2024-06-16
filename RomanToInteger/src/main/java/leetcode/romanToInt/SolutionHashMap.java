package leetcode.romanToInt;
import java.util.HashMap;

class SolutionHashMap {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int sum = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int current = romanMap.get(s.charAt(i));
            int next = 0;
            if (i + 1 < length) {
                next = romanMap.get(s.charAt(i + 1));
            }

            if (next > current) {
                sum -= current;
            } else {
                sum += current;
            }
        }

        return sum;
    }
}
