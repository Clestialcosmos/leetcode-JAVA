class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stk = new Stack<>();
        for(char c : s.toCharArray()){
            
            if(!stk.isEmpty() && stk.peek() == c) stk.pop();

            else stk.push(c);
        }
        int i = 0;
        char[] chars = new char[stk.size()];
        while(!stk.isEmpty())
        { 
            chars[i++] = stk.pop();
        }

        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String res = "";
        for(char c : chars) res += c;

        return res;
    }
}