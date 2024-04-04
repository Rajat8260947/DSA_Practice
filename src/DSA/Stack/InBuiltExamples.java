package DSA.Stack;

import java.util.Stack;

public class InBuiltExamples {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(14);
        stack.push(15);
        stack.push(18);
        stack.push(19);
        stack.push(20);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
