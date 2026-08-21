// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.

// Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

// Solution 1089.

// Approach 1: Destination Array & Source Array.

class Solution1089 {
    public void duplicateZeros(int[] arr) {
        int[] dest = new int[arr.length];

        int s = 0;
        int d = 0;

        while (s < arr.length) {
            if (arr[s] == 0) {
                if(d < arr.length) {
                    dest[d] = 0;
                }
                dest[d] = 0;
                d += 1;
                
                if(d < arr.length) {
                    dest[d] = 0;
                }
            } else {
                 if(d < arr.length) {
                dest[d] = arr[s];
                }
            }

            d += 1;
            s += 1;
        }

        for ( int i = 0; i < arr.length; i++) {
            arr[i] = dest[i];
        }
    }
}

// Approach 2. In place Modification.

class Solutionn1089 {
    public void duplicateZeros(int[] arr) {
        int possibleZeroDups = 0;
        int lastIndex = arr.length - 1;

        for (int i = 0; i <= lastIndex - possibleZeroDups; i++) {
            if(arr[i] == 0) {

                // Edge Case.
                
                if( i == lastIndex - possibleZeroDups){
                    arr[lastIndex] = 0;
                    lastIndex -= 1;
                    break;
                }
                possibleZeroDups++;
            }
        }

        int newLastIndex = lastIndex - possibleZeroDups;

        for (int i = newLastIndex; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleZeroDups] = 0;
                possibleZeroDups--;
                arr[i + possibleZeroDups] = 0;
            }else {
                arr[i + possibleZeroDups] = arr[i];
            }
        }
    }
}

