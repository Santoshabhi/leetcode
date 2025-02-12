public class RemoveSubString {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int index;
        
        while ((index = sb.indexOf(part)) != -1) {
            sb.delete(index, index + part.length()); // Remove the part efficiently
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "daabcbaabcbc";
        String part = "abc";
        
        System.out.println("Result: " + sol.removeOccurrences(s, part)); // Output: "dab"
    }
}
