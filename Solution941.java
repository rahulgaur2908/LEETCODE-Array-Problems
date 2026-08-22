/* Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
arr[i] > arr[i + 1] > ... > arr[arr.length - 1] */

// Solution 941.

// Approach: Use two pointers to traverse the array. First, move the pointer up the mountain until it reaches the peak. Then, move the pointer down the mountain. If the pointer reaches the end of the array, return true. Otherwise, return false.

class Solution941 {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}