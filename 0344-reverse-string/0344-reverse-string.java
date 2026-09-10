class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
       Stack<Character> st = new Stack<>();
        for(char c : s) st.push(c);
        int i = 0;
        while(i != n) s[i++] = st.pop();
    }
}