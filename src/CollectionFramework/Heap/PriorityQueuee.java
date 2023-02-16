package CollectionFramework.Heap;


/*
Insertion and deletion in Max heap takes logarithmic time.
In Default the PQ is MinHeap to get MaxHeap use Collections.reverseOrder()
 */


        /*
        if Queue is empty then peek() will say null AND  if element() then it will say NoSuchElement.
        The remove() and poll() methods differ only in their behavior when the queue is empty:
        the remove() method throws an exception, while the poll() method returns null.
         The element() and peek() methods return, but do not remove, the head of the queue.
         */

import java.util.*;
public class PriorityQueuee {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<10; i++){
            pq.add(i);
        }
        System.out.println(pq);

    }
}
