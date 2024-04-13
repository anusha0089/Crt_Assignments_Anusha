package anusha;
import java.util.Stack;

public class PriorityOperatorChallenge {
    
    public static double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                StringBuilder numStr = new StringBuilder();
                numStr.append(ch);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numStr.append(expression.charAt(++i));
                }
                numbers.push(Double.parseDouble(numStr.toString()));
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
                    performOperation(numbers, operators);
                }
                operators.push(ch);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    performOperation(numbers, operators);
                }
                operators.pop(); // Pop '('
            }
        }
        
        while (!operators.isEmpty()) {
            performOperation(numbers, operators);
        }
        
        return numbers.pop();
    }
    
    private static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-');
    }
    
    private static void performOperation(Stack<Double> numbers, Stack<Character> operators) {
        char op = operators.pop();
        double num2 = numbers.pop();
        double num1 = numbers.pop();
        switch (op) {
            case '+':
                numbers.push(num1 + num2);
                break;
            case '-':
                numbers.push(num1 - num2);
                break;
            case '*':
                numbers.push(num1 * num2);
                break;
            case '/':
                numbers.push(num1 / num2);
                break;
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(evaluateExpression("2+3*4"));    // Output: 14.0
        System.out.println(evaluateExpression("2*3+4"));    // Output: 10.0
        System.out.println(evaluateExpression("2*(3+4)"));  // Output: 14.0
        System.out.println(evaluateExpression("10/2-1"));   // Output: 4.0
        System.out.println(evaluateExpression("5*(3-2)/2+1")); // Output: 6.5
    }
}

