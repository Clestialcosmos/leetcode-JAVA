class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            
            if(!stk.isEmpty() && stk.peek() == c) stk.pop();

            else stk.push(c);
        }
        String res = "";
        while(!stk.isEmpty()){
            res = stk.pop()+res;
        }

        return res;
    }
}