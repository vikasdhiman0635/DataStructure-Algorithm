package Leetcode.Medium;

public class Q2 {
    // https://leetcode.com/problems/add-two-numbers/description/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {

        ListNode node = new ListNode(3, null);
        ListNode node1 = new ListNode(4, node);
        ListNode node12 = new ListNode(2, node1);

        ListNode node2 = new ListNode(4, null);
        ListNode node21 = new ListNode(6, node2);
        ListNode node22 = new ListNode(5, node21);

        // ListNode node12 = new ListNode(2, new ListNode(4, new ListNode(9, null)));

        // ListNode node22 = new ListNode(5, new ListNode(6, new ListNode(4, new
        // ListNode(9, null))));

        // ListNode node12 = new ListNode(9, new ListNode(9, new ListNode(1, null)));

        // ListNode node22 = new ListNode(1, null);

        // ListNode node12 = new ListNode(9, new ListNode(9,
        // new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new
        // ListNode(9, null)))))));

        // ListNode node22 = new ListNode(9, new ListNode(9, new ListNode(9, new
        // ListNode(9, null))));
        // System.out.println();
        ListNode res = addTwoNumbers(node12, node22);
        printList(res);

    }

    public static void printList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // LeetCode Solutions
        // ListNode head = new ListNode(0);
        // ListNode tail = head;
        // int carry = 0;

        // while (l1 != null || l2 != null || carry != 0) {
        // int l1Value = l1 != null ? l1.val : 0;
        // int l2Value = l2 != null ? l2.val : 0;
        // int sum = l1Value + l2Value + carry;
        // carry = sum / 10;
        // ListNode newNode = new ListNode();
        // tail.next = newNode;
        // tail = tail.next;
        // }
        // ListNode resNode = head.next;
        // head.next = null;
        // return resNode;

        int carry = 0;
        int i = 0;

        ListNode res = new ListNode();
        while (l1 != null && l2 != null) {
            int getres = l1.val + l2.val + carry;
            if (getres < 10) {
                carry = 0;
                res = append(res, getres, i);
            } else if (getres == 10 && getres / 10 != 0) {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            } else {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            }
            l1 = l1.next;
            l2 = l2.next;
            getres = 0;
            i++;
        }
        while (l1 != null) {
            int getres = l1.val + carry;
            if (getres < 10) {
                carry = 0;
                res = append(res, getres, i);
            } else if (getres == 10 && getres / 10 != 0) {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            } else {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            }
            l1 = l1.next;
            getres = 0;
            i++;
        }

        while (l2 != null) {
            int getres = l2.val + carry;

            if (getres < 10) {
                carry = 0;
                res = append(res, getres, i);
            } else if (getres == 10 && getres / 10 != 0) {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            } else {
                carry = getres / 10;
                res = append(res, getres % 10, i);
            }
            l2 = l2.next;
            getres = 0;
            i++;
        }
        if (carry != 0) {
            res = append(res, carry, i);
        }
        carry = 0;
        return res;
    }

    public static ListNode append(ListNode l1, int val, int i) {
        ListNode temp = l1;
        if (i == 0) {
            l1.val = val;
            return l1;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(val);
            return l1;
        }
    }

    public static ListNode reverse(ListNode l1) {
        ListNode before = null;
        ListNode temp = l1;
        ListNode after = l1.next;
        while (temp != null) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
        return before;
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