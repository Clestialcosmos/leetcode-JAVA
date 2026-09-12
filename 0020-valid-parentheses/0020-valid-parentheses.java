class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>(); 
        for(char i : s.toCharArray()){
            if(i == '(' || i == '{' || i == '[') {
                stk.push(i);
            } 
            else if(i == ')'){
                if(stk.isEmpty() || stk.peek() != '(') return false;
                stk.pop();
            }
            else if(i == '}'){
                if(stk.isEmpty() || stk.peek() != '{') return false;
                stk.pop();
            }
            else if(i == ']'){
                if(stk.isEmpty() || stk.peek() != '[') return false;
                stk.pop();
            }
        }
        return stk.isEmpty();
    }
}
