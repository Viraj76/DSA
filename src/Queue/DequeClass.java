package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeClass {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offer(34);
        dq.offer(4);
        dq.offer(24);
        dq.offer(84);
        dq.offer(94);
        System.out.println(dq);
        System.out.println(dq.peek());
    }
}

