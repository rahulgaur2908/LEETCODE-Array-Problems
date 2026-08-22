// Given an array arr of integers, check if there exist two indices i and j such that :

// i != j
// 0 <= i, j < arr.length
// arr[i] == 2 * arr[j]

// Solution 1346.

// Approach: Use a HashSet to store the numbers we have seen so far. For each number in the array, check if its double or half is already in the set. If either condition is true, return true. If we finish checking all numbers without finding such a pair, return false.

import java.util.HashSet;
import java.util.Set;

class Solution1346 {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet <> ();

        for (int num : arr) {
            if (set.contains(2 * num) || (set.contains(num / 2) && (num % 2 == 0))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}