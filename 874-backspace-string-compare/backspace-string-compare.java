class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='#'){
                if(!st1.isEmpty()){
                st1.pop();
            }
            }
            else{
                st1.push(ch);
            }
        }

            // Process string t
for (int i = 0; i < t.length(); i++) {
    char ch = t.charAt(i);
    if (ch == '#') {
        if (!st2.isEmpty()) { // Fixed: check st2, not st1
            st2.pop();
        }
    } else {
        st2.push(ch); // Fixed: added missing push for st2
    }
}
            
            return st1.equals(st2);
}}