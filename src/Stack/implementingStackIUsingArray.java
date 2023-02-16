package Stack;

import java.util.Scanner;

class implementingStackUsingArray {
    int top;
    int maxsize = 10;
    int[] arr = new int[maxsize];


    boolean isEmpty() {
        return (top < 0);
    }

    implementingStackUsingArray() {
        top = -1;
    }

    void push(Scanner sc) {
        if (top == maxsize - 1) {
            System.out.println("Overflow");
        } else {
            System.out.print("Enter Value -> ");
            int val = sc.nextInt();
            top++;
            arr[top] = val;
            System.out.println("Item pushed");
        }
    }

    boolean pop() {
        if (top == -1) {
            System.out.println("Underflow");
            return false;
        } else {
            top--;
            System.out.println("Item popped");
            return true;
        }
    }

    void display() {
        System.out.println("Stack elements ");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        implementingStackUsingArray s = new implementingStackUsingArray();
        while (true) {
            System.out.println("\nChose one from the below options...");
            System.out.println("1.Push  2.Pop   3.Show  4.Exit");
            System.out.print("Enter your choice -> ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    s.push(sc);
                }
                case 2 -> {
                    s.pop();
                }
                case 3 -> {
                    s.display();
                }
                case 4 -> {
                    System.out.println("Exiting....");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
}