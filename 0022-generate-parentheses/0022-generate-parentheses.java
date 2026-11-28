class Solution {

    static void generatepair(int l, int r, int n,String ans,List<String> temp) {

        if (l + r == 2 * n) {
            temp.add(ans);
            return;
        }

        if (l < n) {
            generatepair(l + 1, r, n, ans + "(", temp);
        }

        if (r < l) {
            generatepair(l, r + 1, n, ans + ")", temp);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> temp = new ArrayList<>();

        generatepair(0, 0, n, "", temp);

        return temp;
    }
}