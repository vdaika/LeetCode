class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode();
        int v1 = l1.val;
        int v2 = l2.val;
        listNode.val = (v1 + v2) % 10;
        int remain = (v1 + v2) / 10;

        ListNode next1 = l1.next;
        ListNode next2 = l2.next;

        ListNode cursor = listNode;

        while (next1 != null || next2 != null) {
            ListNode note;
            if (next1 == null) {
                note = new ListNode((next2.val + remain) % 10);
                remain = (next2.val + remain) / 10;
            } else if (next2 == null) {
                note = new ListNode((next1.val + remain) % 10);
                remain = (next1.val + remain) / 10;
            } else {
                note = new ListNode((next1.val + next2.val + remain) % 10);
                remain = (next1.val + next2.val + remain) / 10;
            }
            cursor.next = note;
            cursor = note;
            next1 = next1 != null ? next1.next : null;
            next2 = next2 != null ? next2.next : null;
        }

        if (remain > 0) {
            cursor.next = new ListNode(remain);
        }

        return listNode;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}