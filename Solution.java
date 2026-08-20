// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Approach 1: Replace each element by its square and Sort it.

// Solution 977.


/*class Solution {
    public int[] sortedSquares(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = nums[i] * nums[i];
        }

        Arrays.sort(result);

        return result;
    }
}*/

// Approach 2: Two Pointers.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = nums.length - 1;

        int [] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int val;

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                val = nums[l];
                l++;

            } else {
                val = nums[r];
                r--;
            }

            result[i] = val * val;
        }

        return result;
    }
} 