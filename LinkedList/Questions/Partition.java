package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;

public class Partition {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(1);
        list.append(4);
        list.append(3);
        list.append(2);
        list.append(5);
        list.append(2);

        partitionNode(list, 3).printList();
    }

    public static LinkedList partitionNode(LinkedList list, int x) {
        LinkedList lessNumber = new LinkedList();
        LinkedList greaterNumber = new LinkedList();
        Node temp = list.getHead();
        for (int i = 0; i < list.length(); i++) {
            if (temp.value >= x) {
                greaterNumber.append(temp.value);
            } else if (temp.value < x) {
                lessNumber.append(temp.value);
            }
            temp = temp.next;
        }
        Node newTemp = greaterNumber.getHead();
        for (int i = 0; i < greaterNumber.length(); i++) {
            lessNumber.append(newTemp.value);
            newTemp = newTemp.next;
        }
        return lessNumber;
    }

}
