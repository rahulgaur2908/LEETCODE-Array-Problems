/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "". */

// Solution 14.

// Approach 1: Horizontal Scanning.

class Solution14 {
    public int getCommonCountMatchCharacters(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        if (s1.length() > s2.length()) {
            return getCommonCountMatchCharacters(s2, s1);
        }

        int count = 0;

        // Apple
        // Apply

        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return count;
            }

            count++;
        }   

        return count;
    }

    public String longestCommonPrefix(String[] strs) {

        // LEETS
        // LEETCODE
        // LEEP

        if (strs == null || strs.length == 0) {
            return "";
        }

        if (strs.length == 1) {
            return strs[0];
        }

        int minCount = Integer.MAX_VALUE;

        String first = strs[0];

        for (int i = 0; i < strs.length; i++) {
            int count = getCommonCountMatchCharacters(first, strs[i]);

            minCount = Math.min(minCount, count);
        }

        return first.substring(0, minCount);
    }
}

// Approach 2: Vertical Scanning.

class Solutionn14 {
    public String longestCommonPrefix(String[] strs) {
        // LEETS
        // LEETCODE
        // LEE

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }
}