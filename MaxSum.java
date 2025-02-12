class MaxSum {
    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sumOfDigits = getSumOfDigits(num);

            if (map.containsKey(sumOfDigits)) {
                maxSum = Math.max(maxSum, num + map.get(sumOfDigits));
            }
            map.put(sumOfDigits, Math.max(num, map.getOrDefault(sumOfDigits, Integer.MIN_VALUE)));
        }

        return maxSum;
    }

    private int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
