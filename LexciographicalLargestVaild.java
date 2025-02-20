import java.util.Arrays;

public class Solution {
    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        int[] result = new int[size];
        boolean[] used = new boolean[n + 1]; // To track used numbers
        backtrack(result, used, 0, n);
        return result;
    }

    private boolean backtrack(int[] res, boolean[] used, int index, int n) {
        // If we have filled the array, return true
        if (index == res.length) return true;
        
        // If the position is already filled, move to the next index
        if (res[index] != 0) return backtrack(res, used, index + 1, n);
        
        // Try placing numbers from n to 1 in descending order
        for (int num = n; num >= 1; num--) {
            if (used[num]) continue; // Skip if number is already used
            
            int secondIndex = (num > 1) ? index + num : index;
            
            // Check if we can place num at index and index + num
            if (secondIndex < res.length && res[secondIndex] == 0) {
                res[index] = num;
                if (num > 1) res[secondIndex] = num;
                used[num] = true;
                
                // Recur to place the next number
                if (backtrack(res, used, index + 1, n)) return true;
                
                // Backtrack
                res[index] = 0;
                if (num > 1) res[secondIndex] = 0;
                used[num] = false;
            }
        }
        return false;
    }
}
