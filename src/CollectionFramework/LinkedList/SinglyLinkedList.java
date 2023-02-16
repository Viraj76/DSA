package LinkedList;

import java.util.*;
class SLL{
     Node head;
     Node tail;
     int size=0;
    public void insertion(int value){                          //Insertion at Linked lis
             Node newNode= new Node(value);
             if (head == null) {
                 head = newNode;
             } else {
                 tail.next = newNode;
             }
        tail = newNode;
        size++;
     }
    public void display(){                                         //Displaying the Linked List
        Node temp=head;
        System.out.println("\n****         THE LINKED LIST IS          ****");
        while(temp!=null){
            System.out.print(temp.value+" --> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void sizeOfTheLL(){                                                                                 //size of the linked list
        System.out.println("\n****          THE SIZE OF THE LINKED LIST IS          ****   "+ size);
    }
    public void deletionOfANode(){                                                                          //deletion
        Node temp=head;
        Node temp2=head;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the index of the node that you want to delete -->   ");
        int index=sc.nextInt();
        for(int i=1; i<index; i++){
            temp=temp.next;
        }
        for(int i=1; i<=index+1; i++){
            temp2=temp2.next;
        }
        temp.next=temp2;
        size--;
        System.out.println("\n**** Deletion operation have done! Check by displaying Linked List****");
    }
    public void insertAtHead(int value){                                                                      //insert at head
         Node newNode= new Node(value);
         Node temp=head;
         head=newNode;
         head.next=temp;
         size++;
         System.out.println("\n****Insertion at head operation have done! Check by displaying Linked List****");
     }
    public void insertAtCertainPosition(int value, int index){                                                  //insert at certain position
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
        System.out.println("\n****Insertion at certain position operation have done! Check by displaying Linked List****");
    }
    public static class Node {                                                                          //BinarySearchTree.Node class (Heart)
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

public class SinglyLinkedList {
    public static void main(String[] args) {
        SLL list = new SLL();
        Scanner sc = new Scanner(System.in);
        int n = 100;
        System.out.println("\n This code is for inserting node at tails  (INITIALLY)");
        while (n > 0) {
            System.out.println("\n****Operations****");
            System.out.println(
                    "1. Insertion a BinarySearchTree.Node (At Tail)" +
                            "       2. Displaying the Linked list" +
                            "       3. Size of the node" +
                            "       4. Deletion of a BinarySearchTree.Node" +
                            "       5. Insertion a node  (At Head) " +
                            "       6. Insertion at a given position");
            System.out.print("-->  Choose a number corresponding to the operation you want do    ");
            int operation = sc.nextInt();
            switch (operation) {

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
                    System.out.println("Enter a particular index please!");
                    int index = sc.nextInt();
                    list.insertAtCertainPosition(value, index);
                }
                default -> {
                    System.out.println("Enter a valid option number please !");
                    n--;
                }
            }
    }}}