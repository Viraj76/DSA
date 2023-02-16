//package Tree;
//import java.util.*;
//import java.util.Queue;
//public class BinarySearchTree {
//
//    static class Node{
//        int value;
//        Node left=null;
//        Node right=null;
//        Node(int value){
//            this.value=value;
//        }
//    }
//    public void insertionAtBinaryTree(Node node, int value) {
//        if (value < node.value) {
//            if (node.left != null)
//                insertionAtBinaryTree(node.left, value);
//            else{
//                System.out.println(" Inserted " + value + " to left of " + node.value);
//                node.left = new Node(value);}}
//        else if (value > node.value) {
//            if (node.right != null)
//                insertionAtBinaryTree(node.right, value);
//            else {
//                System.out.println("  Inserted " + value + " to right of " + node.value);
//                node.right = new Node(value);}
//        }
//    }
//    public void traverseInOrder(Node node) {
//        if (node != null) {
//            traverseInOrder(node.left);
//            System.out.print(" " + node.value);
//            traverseInOrder(node.right);
//        }
//    }
//    public   void delete(Node root, int n){
//        if(root==null)
//            return;
//        if(root.left==null && root.right==null){
//            if(root.value== n){
//                root=null;
//            }
//            return;
//        }                                                                   //                  10
//        Queue<Node> q= new LinkedList<>();                                  //               /      \
//        q.add(root);                                                        //              13       8
//        Node temp=null;                                                     //          /     \     /  \
//        //          6      40  5     23
//        Node valueNode=null;
//        while(!q.isEmpty()){
//            temp=q.peek();
//            q.remove();
//            if(temp.value== n)
//                valueNode=temp;
//            if(temp.left!=null)
//                q.add(temp.left);
//            if(temp.right!=null)
//                q.add(temp.right);
//        }
//
//        if(valueNode!=null){
//            int x=temp.value;
//            deleteDeepest(root,temp);
//            valueNode.value=x;
//        }
//    }
//    private static void deleteDeepest(Node root, Node delNode) {
//        Queue<Node> q = new LinkedList<Node>();
//        q.add(root);
//        Node temp = null;
//        while (!q.isEmpty()) {
//            temp = q.peek();
//            q.remove();
//            if (temp == delNode) {
//                temp = null;
//                return;
//            }
//            if (temp.right != null) {
//                if (temp.right == delNode) {
//                    temp.right = null;
//                    return;
//                } else
//                    q.add(temp.right);
//            }
//            if (temp.left != null) {
//                if (temp.left == delNode) {
//                    temp.left = null;
//                    return;
//                } else
//                    q.add(temp.left);
//            }
//        }
//    }
//    static Node MergeTrees(Node firstTree, Node SecondTree)
//    {
//        if (firstTree == null)
//            return SecondTree;
//        if (SecondTree == null)
//            return firstTree;
//        firstTree.value += SecondTree.value;
//        firstTree.left = MergeTrees(firstTree.left, SecondTree.left);
//        firstTree.right = MergeTrees(firstTree.right, SecondTree.right);
//        return firstTree;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        BinarySearchTree bt=new BinarySearchTree();
//
//        System.out.print("Enter the ROOT value of the FIRST BINARY TREE --> ");
//        int rootValue=sc.nextInt();
//        Node node=new Node(rootValue);
//
//        System.out.print("Enter the ROOT value of the SECOND BINARY TREE --> ");
//        int rootValue1=sc.nextInt();
//        Node node1=new Node(rootValue1);
//
//        System.out.println("First BINARY Tree with the Root Value "+rootValue+" is created!");
//        System.out.println("Second BINARY Tree with the Root Value "+rootValue1+" is created!");
//        int a=200;
//        while(a>0) {
//            System.out.println("""
//                     \nOPERATIONS -:
//                    1. InsertionFor_FIRST_TREE   2. Displaying_Both_Tree(In-Order)   3. Deletion_of_First_Binary_Tree   4. Deletion_of_Second_Binary_Tree   5.InsertionFor_SECOND_TREE   6.Displaying_Merged_Tree     \s""");
//
//            System.out.print("Choose a number corresponding to the operation you want do --> ");
//            int option=sc.nextInt();
//            switch (option) {
//                case 1 -> {
//                    System.out.print("Enter a value please to insert in tree --> ");
//                    int value = sc.nextInt();
//                    bt.insertionAtBinaryTree(node, value);
//                }
//                case 2 -> {
//                    System.out.println("\nThe Tree 1  is (Inorder)");
//                    bt.traverseInOrder(node);
//                    System.out.println("\nThe Tree 2  is (Inorder)");
//                    bt.traverseInOrder(node1);
//                }
//
//                case 3->{
//                    System.out.println("Enter the value you want to delete");
//                    int value=sc.nextInt();
//                    bt.delete(node,value);
//                }
//                case 4->{
//                    System.out.println("Enter the value you want to delete");
//                    int value=sc.nextInt();
//                    bt.delete(node1,value);
//                }
//                case 5->{
//                    System.out.print("Enter a value please to insert in tree --> ");
//                    int value = sc.nextInt();
//                    bt.insertionAtBinaryTree(node1, value);
//                }
//                case 6->{
//                    Node newAddedTree=MergeTrees(node,node1);
//                    System.out.println("\nThe Merged Tree is");
//                    bt.traverseInOrder(newAddedTree);
//                }
//                default -> System.out.println("\nEnter the valid option please");
//            }
//            a--;
//        }
//
//    }
//}
