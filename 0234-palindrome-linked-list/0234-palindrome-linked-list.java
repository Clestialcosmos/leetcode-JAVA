import java.util.ArrayList;

class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> ajay = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            ajay.add(temp.val);
            temp = temp.next;
        }

        int start = 0;
        int end = ajay.size() - 1;

        while (start <= end) {
            if (ajay.get(start).equals(ajay.get(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}