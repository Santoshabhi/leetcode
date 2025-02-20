import java.util.HashMap;

public class Solution {
    public int numTilePossibilities(String tiles) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        return backtrack(countMap);
    }

    private int backtrack(HashMap<Character, Integer> countMap) {
        int sum = 0;
        for (char c : countMap.keySet()) {
            if (countMap.get(c) > 0) {
                sum++;
                countMap.put(c, countMap.get(c) - 1);
                sum += backtrack(countMap);
                countMap.put(c, countMap.get(c) + 1);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution tp = new Solution();
        System.out.println(tp.numTilePossibilities("AAB")); // Example input
    }
}
