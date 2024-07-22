package LinkedList;

class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length++;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return value;
    }

    public int removeLast() {
        if (length == 0) {
            return 0;
        }
        
        return 0;
    }

}