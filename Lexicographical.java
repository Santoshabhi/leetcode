import java.util.*;

public class Solution {
    private static void generateHappyStrings(int n, String current, List<String> happyStrings) {
        if (current.length() == n) {
            happyStrings.add(current);
            return;
        }
        for (char ch : new char[]{'a', 'b', 'c'}) {
            if (current.isEmpty() || current.charAt(current.length() - 1) != ch) {
                generateHappyStrings(n, current + ch, happyStrings);
            }
        }
    }

    public static String getHappyString(int n, int k) {
        List<String> happyStrings = new ArrayList<>();
        generateHappyStrings(n, "", happyStrings);
        if (k > happyStrings.size()) return "";
        return happyStrings.get(k - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(getHappyString(n, k));
        scanner.close();
    }
}
