
public class MergeTwoSortedLists {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // LeetCode 21 — Merge Two Sorted Lists (recursive)
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2; // base cases
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2); // recursion
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    // Helpers for demo/printing
    public static ListNode build(int[] nums) {
        ListNode dummy = new ListNode(0), cur = dummy;
        for (int x : nums) {
            cur.next = new ListNode(x);
            cur = cur.next;
        }
        return dummy.next;
    }

    public static void print(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val);
            if (cur.next != null) sb.append(" -> ");
            cur = cur.next;
        }
        System.out.println(sb.toString());
    }

    // Quick demo
    public static void main(String[] args) {
        ListNode a = build(new int[]{1, 2, 4});
        ListNode b = build(new int[]{1, 3, 4});
        ListNode merged = mergeTwoLists(a, b);
        print(merged); // Expected: 1 -> 1 -> 2 -> 3 -> 4 -> 4
    }
}
