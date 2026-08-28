// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

// Solution 561.

// Approach 1: Sorting.

import java.util.Arrays;

class Solution561 {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);

        int maxSum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }
}

// Approach 2: Counting Sort.

class Solutionn561 {
    public int arrayPairSum(int[] nums) {
        int k = 10000;

        int[] countArr = new int[2 * k + 1];

        for (int i = 0; i < nums.length; i++) {
            countArr[nums[i] + k]++;
        }

        boolean isEvenIndex = true;
        int maxSum = 0;

        for (int i = 0; i < 2 * k + 1; i++) {
            while (countArr[i] > 0) {

            maxSum = maxSum + (isEvenIndex ? (i - k) : 0);
                countArr[i]--;
                isEvenIndex = !isEvenIndex;
           
                
            }
        }


        return maxSum;
    }
}