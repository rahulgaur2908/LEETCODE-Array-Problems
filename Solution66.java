/* You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. */

// Solution 66.

// Approach 1: Carry Propagation or Right-to-Left Carry approach.

class Solution66 {
    public int[] plusOne(int[] digits) {
        // 1, 2, 3
        // 1, 2, 4

        // 1, 9, 9
        // 2, 0, 0

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;

            } else {
                digits[i] = 0;
            }
        }

        int[] newArray = new int[digits.length + 1];
        newArray[0] = 1;
        digits = newArray;
        return digits;
    }
}