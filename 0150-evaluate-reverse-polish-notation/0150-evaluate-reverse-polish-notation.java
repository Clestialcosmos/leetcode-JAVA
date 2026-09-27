class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        
        for (String c : tokens) {
            if (c.equals("+")) {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b + a);
            } 
            else if (c.equals("-")) {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b - a);  
            } 
            else if (c.equals("*")) {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b * a);
            } 
            else if (c.equals("/")) {
                int a = stk.pop();
                int b = stk.pop();
                stk.push(b / a);   
            } 
            else {
                stk.push(Integer.parseInt(c)); 
            }
        }
        
        return stk.pop();
    }
}
