package problems;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {

    public int lengthOfLongestSubstring(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        Set<Character> charSet = new HashSet<>(); // Set to store characters in the current window

        for (int right = 0; right < s.length(); right++) { // Right pointer of the sliding window
            char currentChar = s.charAt(right);

            // If the current character is already in the set, shrink the window from the left
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }

            // Add the current character to the set and update the maximum length
            charSet.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }


    public static void main(String[] args) {

    }
}
