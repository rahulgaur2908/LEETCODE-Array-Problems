/* Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

After doing so, return the array. */

// Solution 1299.

// Approach: We can iterate the array from the end to the beginning, keeping track of the maximum value seen so far. For each element, we replace it with the current maximum and then update the maximum if the current element is greater than the maximum.

class Solution1299 {
    public int[] replaceElements(int[] arr) {
        int max = - 1;

        for ( int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}