package task3;

import java.util.HashSet;
import java.util.Set;

public class Task3_LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> setChar = new HashSet<>();
        int maxVal = 0;
        int i = 0;
        int j = 0;

        while (j < s.length()){
            if(!setChar.contains(s.charAt(j))){
                setChar.add(s.charAt(j));
                maxVal = Math.max(maxVal, ++j - i);
            } else
                setChar.remove(s.charAt(i++));
        }
        return maxVal;
    }
}
