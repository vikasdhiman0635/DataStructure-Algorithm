package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public int length()
    {
        return length;
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

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            head = null;
            tail = null;
            return null;
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
            return pre;
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

    public boolean insert(int index, int value) {
        System.out.println(length);
        if (index < 0) {
            return false;
        } else if (index > length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = head;
        Node next = null;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        next = temp.next;
        temp.next = newNode;
        newNode.next = next;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }
        Node temp = head;
        int x = 0;
        while (x < index - 1) {
            temp = temp.next;
            x++;
        }
        Node nextNodes = temp.next;
        temp.next = null;
        temp.next = nextNodes.next;
        length--;
        return nextNodes;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

}