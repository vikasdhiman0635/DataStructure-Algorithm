// package Leetcode.Medium;

// public class Q92 {

// public static void main(String[] args) {

// // [1,2,3,4,5]
// // ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3, new
// // ListNode(4, new ListNode(5, null)))));

// ListNode node1 = new ListNode(5, null);

// ListNode res = reverseBetween(node1, 1, 1);
// printList(res);
// }

// public static void printList(ListNode node) {
// ListNode temp = node;
// while (temp != null) {
// System.out.println(temp.val);
// temp = temp.next;
// }
// }

// public static ListNode reverseBetween(ListNode head, int left, int right) {

// ListNode newNode = new ListNode(0);
// ListNode tail = newNode;
// int leftIndex = 0;
// int rightIndex = 0;
// ListNode leftNode = new ListNode(0);
// ListNode rightNode = new ListNode(0);
// int length = 0;
// while (head != null) {
// tail = head;
// tail = tail.next;
// length++;
// }
// ListNode temp = newNode;
// int i = 1;
// while (i <= length) {
// if (leftIndex == left && rightIndex == right) {
// if (leftIndex == left) {
// leftNode =
// } else if (rightIndex == right) {

// }
// } else {
// leftIndex++;
// rightIndex++;
// }
// }
// return newNode;
// // ListNode newNode = new ListNode(0);
// // ListNode tail = newNode;

// // int leftNode = 0;
// // int rightNode = 0;
// // int length = 0;
// // while (head != null) {
// // tail.next = head;
// // tail = tail.next;
// // length++;
// // if (left == length) {
// // leftNode = head.val;
// // }
// // if (right == length) {
// // rightNode = head.val;
// // }
// // head = head.next;
// // }
// // ListNode temp = newNode.next;
// // int i = 1;
// // while (i <= length) {
// // if (i == left) {
// // temp.val = rightNode;
// // }
// // if (i == right) {
// // temp.val = leftNode;
// // }
// // i++;
// // temp = temp.next;
// // }

// // return newNode.next;

// // ListNode newNode = new ListNode(0);
// // ListNode tail = newNode;
// // ListNode temp = head;
// // int length = 0;
// // int beforeNode =0;
// // int afterNode = 0;
// // while (temp != null) {
// // length++;
// // tail.next = temp;
// // tail = tail.next;

// // if (length == left) {
// // beforeNode = tail.val;
// // }
// // if (length == right) {
// // afterNode = tail.val;
// // }
// // temp = temp.next;
// // }

// // ListNode testTemp = new ListNode(beforeNode);
// // beforeNode = afterNode;
// // afterNode = testTemp.val;
// // return newNode.next;
// }

// }

// class ListNode {
// int val;
// ListNode next;

// ListNode() {
// }

// ListNode(int val) {
// this.val = val;
// }

// ListNode(int val, ListNode next) {
// this.val = val;
// this.next = next;
// }
// }