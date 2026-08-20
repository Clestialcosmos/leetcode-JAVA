class Solution {
    private int s(int n, int k) {
        int m = n / k; // m = number of multiples
        return k * m * (m + 1) / 2;
    }

    public int sumOfMultiples(int n) {
        int sum = 0;
        sum += s(n, 3) + s(n, 5) + s(n, 7);
        sum -= s(n, 15) + s(n, 21) + s(n, 35);
        sum += s(n, 105);
        return sum;
    }
}
