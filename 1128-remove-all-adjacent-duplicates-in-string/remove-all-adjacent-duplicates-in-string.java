class Solution {
    public String removeDuplicates(String s) {
       Stack<Character> st = new Stack<>();
       StringBuilder sb= new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
         if(!st.isEmpty() && st.peek()==ch){
         st.pop();
         }
         else{
            st.push(ch);
         }
       }
       for(char ch:st){
        sb.append(ch);
       }
       
       return sb.toString();
    }
}