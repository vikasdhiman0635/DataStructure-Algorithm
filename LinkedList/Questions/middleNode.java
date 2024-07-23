package LinkedList.Questions;

import LinkedList.LinkedList;
import LinkedList.Node;

public class middleNode {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(2);
        list.append(12);
        list.append(112);
        list.append(13);
        list.append(1345);

        System.out.println("Find middle Node: " + findMiddleNode(list).value);

    }

    public static Node findMiddleNode(LinkedList list) {
        Node temp = list.getHead();
        for (int i = 0; i < list.length() / 2; i++) {
            temp = temp.next;
        }
        return temp;
    }

}