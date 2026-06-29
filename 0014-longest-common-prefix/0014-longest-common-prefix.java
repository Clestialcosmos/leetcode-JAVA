class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
        int c = Math.min(a.length(),b.length());
        for(int i = 0;i<c;i++){
            if(a.charAt(i) != b.charAt(i)){
                break;   
            }
            res += a.charAt(i);
        }
        return res;
    }
}