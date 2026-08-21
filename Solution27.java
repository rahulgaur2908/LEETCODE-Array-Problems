// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.

// Return k.

// Solution 27.

// Approach 1: Two pointers where one pointer itreates through the array and the other pointer keeps track of the position to place the next non-val elements.

class Solution27 {
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for ( int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}

// Approach 2: Two pointers - when elements to remove are rare.

class Solutionn27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;

        int i = 0;

        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }
}