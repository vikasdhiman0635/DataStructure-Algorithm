package Questions;

import java.util.Stack;
import java.util.stream.Collectors;

public class Q682 {

    public static void main(String[] args) {

        String[] operations = { "1","C" };
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] == "C") {
                stack.pop();
            } else if (operations[i] == "D") {
                int mul = stack.peek();
                stack.push(mul * 2);
            } else if (operations[i] == "+") {
                int peek = stack.peek();
                stack.pop();
                int lastPeek = stack.peek();
                int total = peek + lastPeek;
                stack.push(peek);
                stack.push(total);
            } else {
                int val = Integer.parseInt(operations[i]);
                stack.push(val);
            }
        }
        int total = 0;
        while (!stack.isEmpty()) {
            total = total + stack.peek();
            stack.pop();
        }
        System.out.println();
        System.out.println(total);
    }

}
