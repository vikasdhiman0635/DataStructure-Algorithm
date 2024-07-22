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

    public int prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return newNode.value;
    }

    public int removeLast() {
        if (length == 0) {
            return 0;
        } else if (length == 1) {
            head = null;
            tail = null;
            return 0;
        } else {
            Node pre = head;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                if (temp.next == null) {
                    break;
                }
                pre = pre.next;
            }
            pre.next = null;
            tail = pre;
            length--;
            return pre.value;
        }
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public Node get(int index) {
        if (length == 0 && index > length) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
            length--;
            return head;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int value, int index) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

}