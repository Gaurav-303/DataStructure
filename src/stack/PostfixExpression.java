package stack;

import java.util.Stack;

public class PostfixExpression {
    public static int evaluatePostfix(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(val1 + val2);
                        break;
                    case "-":
                        stack.push(val1 - val2);
                        break;
                    case "*":
                        stack.push(val1 * val2);
                        break;
                    case "/":
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "2 3 1 * + 9 -";
        int result = evaluatePostfix(expression);
        System.out.println("Result: " + result);
    }
}
