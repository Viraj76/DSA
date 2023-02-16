package Stack;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(35);
        stack.push(45);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.set(0,23);
        System.out.println(stack);
        System.out.println(stack.elementAt(4));
      //  stack.  SO MANY FUNCTIONS EXISTS
    }
}
