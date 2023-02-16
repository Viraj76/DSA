package Stack;
import java.io.*;
public class infixToPostfix {
    static class Stack {
        static char[] a = new char[100];
        static int top = -1;

        static void push(char c) {
            try {
                a[++top] = c;
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Stack full, no room to push, size=100");
                System.exit(0);
            }
        }

       static char pop() {
            return a[top--];
        }

        static boolean isEmpty() {
            return top != -1;
        }

        static char peek() {
            return a[top];
        }
    }
    public static void main(String[] argv) throws IOException {
        String infix;
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter the infix expression you want to convert: ");
        infix = keyboard.readLine();
        System.out.println("Postfix expression for the given infix expression is:" + toPostfix(infix));
    }
    private static String toPostfix(String infix) {
        char symbol;
        StringBuilder postfix = new StringBuilder();

        for (int i = 0; i < infix.length(); ++i) {
            symbol = infix.charAt(i);
            if (Character.isLetter(symbol))
                postfix.append(symbol);
            else if (symbol == '(')
                infixToPostfix.Stack.push(symbol);
            else if (symbol == ')') {
                while (infixToPostfix.Stack.peek() != '(') {
                    postfix.append(infixToPostfix.Stack.pop());
                }
                infixToPostfix.Stack.pop();        //remove '('
            }
            else {
                while (infixToPostfix.Stack.isEmpty() && !(infixToPostfix.Stack.peek() == '(') && precedence(symbol) <= precedence(infixToPostfix.Stack.peek()))
                    postfix.append(infixToPostfix.Stack.pop());
                infixToPostfix.Stack.push(symbol);
            }
        }
        while (infixToPostfix.Stack.isEmpty())
            postfix.append(infixToPostfix.Stack.pop());
        return postfix.toString();
    }
    static int precedence(char x) {
        if (x == '+' || x == '-')
            return 1;
        if (x == '*' || x == '/' || x == '%')
            return 2;
        return 0;
    }
}  