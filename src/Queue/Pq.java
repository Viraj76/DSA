package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Pq {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//        pq.add(2);
//        pq.add(7);
//        pq.add(4);
//        pq.add(1);
//        pq.add(8);
//        pq.add(1);
        System.out.println(pq);      //2,7,4,1,8,1
        while(pq.size() > 1){
            int n1 = pq.poll();
            int n2 = pq.poll();System.out.println(pq.size());
            System.out.println(n1+ " " + n2);
            if(n1 > n2 || n1<n2){pq.add(Math.abs(n1-n2));}
        }
        System.out.println(pq.size());
        System.out.println(pq);
    }
}
