class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '[') stk.push(c);
             else{
                if(c == ')'){
                    if(stk.isEmpty() || stk.peek() != '(') return false;
                    else stk.pop();
                }
                else if(c == '}'){
                    if(stk.isEmpty() || stk.peek() != '{') return false;
                    else stk.pop();
                }
                else if(c == ']'){
                    if(stk.isEmpty() || stk.peek() != '[') return false;
                    else stk.pop();
                }
            }
        }
        return stk.isEmpty();
    }
}