package Questions;

import LinkedList.LinkedList;

public class MergeLinkedList {

    // public static void merge(LinkedList otherList) {
    // }

    public static void main(String[] args) {
        System.out.println();

        LinkedList l1 = new LinkedList(1);
        l1.append(3);
        l1.append(5);
        l1.append(7);

        LinkedList l2 = new LinkedList(2);
        l2.append(4);
        l2.append(6);
        l2.append(8);

        l1.merge(l2);
        // l2.printList();
        l1.printList();

    }

}
