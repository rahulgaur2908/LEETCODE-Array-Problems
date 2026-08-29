/* You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words. */

// Solution 1684.

// Approach 1: By using boolean array.

import java.util.HashSet;
import java.util.Set;

class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];

        for (char c : allowed.toCharArray()) {
            arr[c - 'a'] = true;
        }

        
     
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!arr[c - 'a']) {
                    isConsistent = false;
                    break;
                }

            }

            if (isConsistent == true) {
                count++;
            }
        }


        return count;
    }
}

// Approach 2: By using HashSet.

class Solutionn1684 {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> set = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            set.add(c);
        }

        
     
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    isConsistent = false;
                    break;
                }

            }

            if (isConsistent == true) {
                count++;
            }
        }


        return count;
    }
}


// Approach 3: By using bit manipulation.

class Solutionnn1684 {
    public int countConsistentStrings(String allowed, String[] words) {
       int mask = 0;

        for (char c : allowed.toCharArray()) {
            mask = mask | (1 << (c - 'a'));
        }

        
     
        int count = 0;
        for (String word : words) {
            boolean isConsistent = true;
            for (char c : word.toCharArray()) {
                int res = (1 << (c - 'a'));
                if ((mask & res) == 0) {
                    isConsistent = false;
                    break;
                }

            }

            if (isConsistent == true) {
                count++;
            }
        }


        return count;
    }
}