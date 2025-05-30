import java.util.Stack;

public class Solution {
    public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String pattern = "IDID";
        System.out.println(sol.smallestNumber(pattern)); // Output: 13254
    }
}
