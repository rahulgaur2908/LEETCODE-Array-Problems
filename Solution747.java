/* You are given an integer array nums where the largest integer is unique.

Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise. */

// Solution 747.

// Approach 1: By using two variables to store the maximum and second maximum values, we can determine if the largest number is at least twice as large as the second largest number. If it is, we return the index of the largest number; otherwise, we return -1.

class Solution747 {
    public int dominantIndex(int[] nums) {
        int idx = -1;
        int max1 = -1;
        int max2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
                idx = i;

            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }


        return max1 >= (2 * max2) ? idx : -1;
    }
}