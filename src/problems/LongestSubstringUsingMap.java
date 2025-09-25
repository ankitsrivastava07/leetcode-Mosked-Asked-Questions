package problems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringUsingMap {

    public static String findLongestSubstringWithoutRepeatingCharacter(String s) {

        Map<Character, Integer> chrsMap = new HashMap<>();
        int start = 0;
        int maxLength = 0;
        int longestSubStringMaxLength = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            if (chrsMap.containsKey(ch) && chrsMap.get(ch) >= start)
                start = chrsMap.get(ch) + 1;

        }


        return "";
    }

    public static void main(String[] args) {

    }

}
