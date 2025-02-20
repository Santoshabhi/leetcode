import java.util.*;

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder result = new StringBuilder();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Flip the diagonal character
            char flippedChar = (nums[i].charAt(i) == '0') ? '1' : '0';
            result.append(flippedChar);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] nums = {"01", "10"};
        System.out.println(solution.findDifferentBinaryString(nums));
    }
}
