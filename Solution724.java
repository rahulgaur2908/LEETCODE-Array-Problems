/* Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1. */

// Solution 724.

// Approach 1: Two-Pass Solution.

class Solution724 {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == rightSum - nums[i]) {
                return i;
            }

            leftSum += nums[i];
            rightSum -= nums[i]; 
        }

        return -1;
    }
}