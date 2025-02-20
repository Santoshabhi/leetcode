

class Solution {  
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap = new PriorityQueue<>();

        // Add all elements to the min heap, convert to long to prevent overflow
        for (int num : nums) {
            minHeap.offer((long) num);
        }

        int operations = 0;

        // Edge case: If all numbers are already ≥ k, no operations are needed
        if (minHeap.peek() >= k) {
            return 0;
        }

        // Continue while we have at least two elements and the smallest is < k
        while (minHeap.size() > 1) {
            long x = minHeap.poll(); // Smallest
            if (x >= k) {
                return operations; // If the smallest is already ≥ k, return count
            }

            long y = minHeap.poll(); // Second smallest

            // Prevent overflow by using long
            long newVal = (Math.min(x, y) * 2) + Math.max(x, y);
            minHeap.offer(newVal);
            operations++;
        }

        // Final check: If the last remaining element is still < k, return -1
        return (minHeap.peek() >= k) ? operations : -1;
    }
}
