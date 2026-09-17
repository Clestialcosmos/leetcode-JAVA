class Solution {
    public int countOfSubstrings(String word, int k) {
        int count = 0;
        for(int j = 0;j<word.length();j++){
            int a = 0 , e = 0,i = 0,o = 0,u = 0,cons = 0;
            for(int t = j;t<word.length();t++){
                if(word.charAt(t) == 'a') a++;
                else if(word.charAt(t) == 'e') e++;
                else if(word.charAt(t) == 'i') i++;
                else if(word.charAt(t) == 'o') o++;
                else if(word.charAt(t) == 'u') u++;
                else cons++;
                if(a > 0 && e>0 && i > 0 && o >0 && u > 0 && cons == k ) count++;
            }
        }
        return count;
    }
}