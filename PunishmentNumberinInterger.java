public class Solution{
    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println(punishmentNumber(n));
    }

    public static int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), 0, i, 0)) {
                sum += square;
            }
        }
        return sum;
    }

    private static boolean canPartition(String s, int index, int target, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }

        int num = 0;
        for (int i = index; i < s.length(); i++) {
            num = num * 10 + (s.charAt(i) - '0'); // Extract number from substring
            if (num > target) break; // Stop early if sum exceeds target
            if (canPartition(s, i + 1, target, currentSum + num)) {
                return true;
            }
        }
        return false;
    }
}
