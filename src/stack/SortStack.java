package stack;

import java.util.Stack;

public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int curr = stack.pop();


            while (!tempStack.isEmpty() && tempStack.peek() > curr) {
                stack.push(tempStack.pop());
            }
            tempStack.push(curr);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);

        Stack<Integer> sorted = sortStack(stack);

        System.out.println("Sorted Stack (Top to Bottom): " + sorted);
    }
}

