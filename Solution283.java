/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array. */

// Solution 283.

// Approach 1: Two pointer.

class Solution283 {
    public void moveZeroes(int[] nums) {
        int[] res = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                res[j] = nums[i];
                j++;
            }
        }

        while (j < nums.length) {
            res[j] = 0;
            j++;


}

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }
    }
}

// Approach 2: Two Pointer (Where 'i' is slow pointer and 'j' is fast pointer).

class Solutionn283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        while (slow < nums.length) {
            nums[slow] = 0;
            slow++;
        }
    }
}

// Approach 3: Two Pointer (Where 'i' is slow pointer and 'j' is fast pointer). moving pointer to the next non-zero element and swapping it with the slow pointer.

class Solutionnn283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }

            fast++;
        }
    }
}