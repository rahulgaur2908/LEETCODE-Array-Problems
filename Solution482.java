// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Solution 482.

// Approach 1: Use a HashSet to store the numbers in the array, then iterate through the range [1, n] to find the missing numbers.

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class Solution482 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        List<Integer> res = new LinkedList<>();

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        return res;
    }
}

// Approach 2: Use the input array itself to mark the presence of numbers. For each number in the array, mark the index corresponding to that number as negative. Then, iterate through the array again to find the indices that are still positive, which indicates the missing numbers.

class Solutionn482 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for ( int i = 0; i < nums.length; i++) {
            int currNum = Math.abs(nums[i]);

            int idx = currNum - 1;

            if (nums[idx] < 0) {
                continue;
            }

            nums[idx] = -1 * nums[idx];
        }

        List<Integer> res = new LinkedList<>();
        //  1   1
        // -1   1

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}