public class Q3217 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode tail = head;
        for (int i = 2; i < 6; i++) {
            tail.next = new ListNode(i);
            tail = tail.next;
        }
        int[] arr = new int[] { 1, 2, 3 };

        ListNode temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.val == arr[i]) {

            }
            temp = temp.next;
        }

    }

}

class ListNode {
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