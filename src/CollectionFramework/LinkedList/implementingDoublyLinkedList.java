package LinkedList;

class DLL{
    private Node head;
    private Node tail;
    private int size=0;


     public void insertion(int value){

         Node newNode=new Node( value);
         if(head==null){
             head=newNode;
             tail=newNode;
         }
         else{
             tail.previous=newNode;
             tail.next=newNode;
             tail=newNode;
         }
         size++;

     }

     public void display(){
         Node temp=head;
         System.out.println("The Double linked list is");
         while(temp!=null){

             System.out.print(temp.value+"<--");
            temp=temp.next;

         }
         System.out.println("END");
     }
     public static class Node{
        private int value;
        private Node next;
        private Node previous;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
        public Node(int value , Node next){
            this.value=value;
            this.next=null;
        }
        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = null;
            this.previous = null;
        }
    }
}


public class implementingDoublyLinkedList {
    public static void main(String[] args) {

        DLL list=new DLL();
        list.insertion(1);
        list.insertion(2);
        list.insertion(3);
        list.insertion(4);
        list.display();
    }
}
