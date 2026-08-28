/* Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown. */


// Solution 119.

// Approach 1: By using a list to store the current row and updating it in place.

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // The first element is always 1
        
        for (int i = 1; i <= rowIndex; i++) {
            // Start from the end to avoid overwriting values
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // The last element is always 1
        }
        
        return row;
    }
}


// Approach 2: By using two lists to store the previous and current rows. (Dynamic Approach)

class Solutionn119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        for (int idx = 1; idx <= rowIndex; idx++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int i = 1; i <= idx - 1; i++) {
                curr.add(prev.get(i) + prev.get(i - 1));
            }

            curr.add(1);

            prev = curr;
        }

        return prev;
    }
}


// Approach 3: By using Permutation and Combination formula to calculate the elements of the row directly. (Mathematical Approach)

class Solutionnnn119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            int currEle = (int)(row.get(i - 1) * (long)(rowIndex - i + 1) / i);
            row.add(currEle);
        }

        return row;
    }
}