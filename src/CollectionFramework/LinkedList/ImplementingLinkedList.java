package LinkedList;

import java.util.*;

class LL{
     Node head;
     Node tail;
     int size=0;
     public void insertion(int value){                          //Insertion at Linked lis
             Node newNode= new Node(value);
             if (head == null)
                 head = newNode;
             else
                tail.next=newNode;
         tail = newNode;
         size++;
     }                                                                              // 1.

     public void display(){                                         //Displaying the Linked List
         Node temp=head;
         System.out.println("\n****         THE LINKED LIST IS          ****");
         while(temp!=null){
             System.out.print(temp.value+" --> ");
             temp=temp.next;
         }
         System.out.println("END");
     }                                                                                         // 2.

     public void sizeOfTheLL(){
        System.out.println("\n****          THE SIZE OF THE LINKED LIST IS          ****   "+ size);
    }                                                                                     // 3.

     public void deletionOfANode(){
        Node temp=head;
        Node temp2=head;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index of the node that you want to delete    ");
        int index=sc.nextInt();
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        for(int i=1; i<=index+1; i++){
            temp2=temp2.next;
        }
        temp.next=temp2;
        size--;
        System.out.println("\n****          Deletion operation have done! Check by displaying Linked List           ****");
    }                                                                                 // 4.

     public void insertAtHead(int value){
         Node newNode= new Node(value);
         newNode.next=head;
         head=newNode;
         size++;
         System.out.println("\n****         Insertion at head operation have done! Check by displaying Linked List          ****");
     }                                                                           // 5.

     public int searchingANode(int value){
        Node temp=head;
        for(int i=0; i<size; i++){
            if(temp.value==value){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }                                                                          // 6.

     public void sortingLinkedList(){
         int temp = 0;
         for(int i=0; i<size; i++) {
             Node current =head;
             Node index = current.next;
             for (int j = 0; j < size - i - 1; j++) {
                 if (current.value > index.value) {
                     temp = current.value;
                     current.value = index.value;
                     index.value = temp;
                 }
                 current = index;
                 index = index.next;
             }
         }
         System.out.println("\n****          Sorting operation have done! Check by displaying Linked List           ****");
    }                                                                                  // 7.

     public void insertAtCertainPosition(int value, int index){
        if(index ==0){
            insertAtHead(value);
        }
        Node temp=head;
        Node temp2=head;
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        for(int i=1; i<=index; i++){
            temp2=temp2.next;
        }
        Node newNode=new Node(value, temp.next);
        temp.next=newNode;
        newNode.next=temp2;
        size++;
        System.out.println("\n****          Insertion at certain position operation have done! Check by displaying Linked List          ****");
    }                                                     // 8.
     public static class Node {
          int value;
          Node next;
         Node(int value) {
             this.value = value;
             this.next = null;
         }
         Node(int value , Node next){
             this.value=value;
             this.next=null;
         }
     }
 }

public class ImplementingLinkedList{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LL list= new  LL();
        int a=200;
        while (a>0) {
            System.out.println("\n****Operations****");
            System.out.println(
                    "1. Insertion a BinarySearchTree.Node (At Tail)" +
                            "       2. Displaying the Linked list" +
                            "       3. Size of the node" +
                            "       4. Deletion of a BinarySearchTree.Node" +
                            "       5. Insertion a node  (At Head" +
                            "\n6. Searching a node" +
                            "                 7. Sorting the Linked List" +
                            "                         8. Insertion at a given position");
            System.out.print("-->  Choose a number corresponding to the operation you want do    ");
            int option=sc.nextInt();
            switch (option) {

                case 1 -> {
                    System.out.println("Enter a value please!");
                    int value = sc.nextInt();
                    list.insertion(value);
                }
                case 2 -> list.display();
                case 3 -> list.sizeOfTheLL();
                case 4 -> list.deletionOfANode();
                case 5 -> {
                    System.out.println("Enter a value please!");
                    int value = sc.nextInt();
                    list.insertAtHead(value);
                }
                case 6 -> {
                    System.out.println("Enter a value please!");
                    int value = sc.nextInt();
                    int ans =list.searchingANode(value);
                    if(ans!=-1)
                        System.out.format("****         Yes %d is present in the Linked List at index %d            ****",value,ans);

                }
                case 7 -> list.sortingLinkedList();
                case 8 -> {
                    System.out.println("Enter a value please!");
                    int value = sc.nextInt();
                    System.out.println("Enter a particular index please!");
                    int index = sc.nextInt();
                    list.insertAtCertainPosition(value, index);
                }

                default -> {
                    System.out.println("Enter a valid option number please !");
                }

            }
            a--;
        }




    }
}