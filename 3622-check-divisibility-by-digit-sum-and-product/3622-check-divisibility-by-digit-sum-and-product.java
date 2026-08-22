class Solution {
    public boolean checkDivisibility(int n) {
        int pro = 1;
       int sum = 0;
       int a = n;
       while(n != 0){
        int rem = n%10;
        pro *= rem;
        sum += rem;
        n /= 10;
       }
       int c = pro+sum;
       return a%c == 0; 
    }
}