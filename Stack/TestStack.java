public class TestStack {
    
    public static void main(String[] args) {
        System.out.println();
        Stack stack = new Stack(2);
        stack.push(12);
        stack.push(1);
        stack.printStack();
        System.out.println("------------------------");
        System.err.println(stack.pop().value);
        stack.printStack();

    }

}
