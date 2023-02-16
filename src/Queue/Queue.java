package Queue;


public class Queue {
        int[] array;
        int size;
        int front,rear;

        Queue(int size){
            array=new int[size];
            this.size=size;
            front=-1;
            rear = -1;
        }

        public void enQueue(int element){
            if(isFull()){
                System.out.println("Queue.Queue is full!");
            }
            else {
                if(front==-1)
                    front=0;
                rear++;
                array[rear]=element;
            }
        }

        public int deQueue(){
            int element;
            if(isEmpty()){
                System.out.println("Queue.Queue is already empty");
                return -1;
            }
            else {
                element=array[front];
                front++;
                return element;
            }
        }

        Boolean isFull(){
            return rear==size-1;
        }

        Boolean isEmpty(){
            return front == -1;
        }

        void display(){
            for(int i:array)
                System.out.print(i+" ");

    }
    public static void main(String[] args) {
        Queue queue=new Queue(5);
        queue.enQueue(45);
        queue.enQueue(67);
        queue.enQueue(23);
        queue.enQueue(56);
        queue.enQueue(2);
        queue.enQueue(778);
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        queue.display();
    }
}
