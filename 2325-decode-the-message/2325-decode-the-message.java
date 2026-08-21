class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character , Character> kv = new HashMap<>();
        char chi = 'a';
        for(int i = 0;i<key.length();i++){
            char ch = key.charAt(i);
            if(ch == ' ') continue;
            else if(!kv.containsKey(ch)){
                kv.put(ch,chi++);
            }
        }
        String ans = "";
        for(int i = 0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch == ' ') ans += ' ';
            else{
                ans += kv.get(ch);
            }
        }
        return ans;

    }
}