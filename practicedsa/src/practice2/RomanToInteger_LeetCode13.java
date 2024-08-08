package practice2;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_LeetCode13 {


    public int romanToInt(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        int result = 0;
        for (int i = 0; i < s.length(); i++) {


            if ((i + 1 < s.length()) && mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))) {
                result -= mp.get(s.charAt(i));
            } else {
                result += mp.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger_LeetCode13 tl = new RomanToInteger_LeetCode13();
        String s = "LVIII";
        System.out.println(tl.romanToInt(s));

    }
}