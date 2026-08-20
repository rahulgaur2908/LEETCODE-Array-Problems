// Given an array nums of integers, return how many of them contain an even number of digits.

// Solution 1295.

class Solution1295 {
    public boolean numberHasEvenDigits(int num) {
        int digitsCount = 0;

        while ( num != 0 ) {
            num = num / 10;
            digitsCount++;
        }

        return digitsCount % 2 == 0;
    }

    public int findNumbers( int[] nums){
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (numberHasEvenDigits(nums[i])) {
                evenCount++;
            }
        }

        return evenCount;
    }
}