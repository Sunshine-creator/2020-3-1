package cww20200301;
public class LinkedList {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode removeElement(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = pre.next; //往后玄幻
            } else {
                pre = cur;
                cur = cur.next;
            }
        }
        if (head.val == val) {
            head = head.next;
        }

    }
}
