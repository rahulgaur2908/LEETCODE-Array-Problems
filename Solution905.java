/* Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition. */

// Solution 905

// Approach 1: Creating a Comparator to sort the array based on parity.

import java.util.Arrays;

class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        Integer[] res = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i];
        }

        Arrays.sort(res, (val1, val2) -> Integer.compare(val1 % 2, val2 % 2));

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

        return nums;
    }
}

// Approach 2: Creating a new empty array and filling it with even numbers first, followed by odd numbers. And using three pointer to compare element (i, j and k).

class Solutionn905 {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                res[index] = nums[i];
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) {
                res[index] = nums[i];
                index++;
            }
        }

        return res;
    }
}

// Approach 3: Using two pointers to swap even and odd numbers in the same array. From the left side, we will check for even numbers and from the right side, we will check for odd numbers. If we find an odd number on the left and an even number on the right, we will swap them.

class Solutionnn905 {
    public int[] sortArrayByParity(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        return nums;
    }
}