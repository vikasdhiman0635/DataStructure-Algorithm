package LinkedList;

public class main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(2);
        list.append(12);
        list.append(112);
        list.append(13);
        list.append(1345);

        // list.removeFirst();
        // System.out.println("get value: " + list.get(3).value);
        // System.out.println("set value: " + list.set(12, 1));
        // System.out.println("insert item: " + list.insert(123, 9));
        System.out.println("Remove last:" + list.remove(2));

        list.printList();
    }

}
