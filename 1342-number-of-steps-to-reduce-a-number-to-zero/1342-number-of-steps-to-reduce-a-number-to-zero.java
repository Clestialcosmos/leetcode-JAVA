class Solution {
    public int numberOfSteps(int num) {
        int count = -1;
        if(num == 0) return 0;
        while(num != 0){
            if(num %2 != 0){
                num -= 1;
                count+=2;
            }
            else count++;
            num /= 2;
        }
        return count;
    }
}