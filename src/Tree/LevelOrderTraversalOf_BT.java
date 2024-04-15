//import Tree.BinarySearchTree;
//
//import java.util.Scanner;
//
//public class Tree.Exercise_9_BST {
//    static class Node{
//        int value;
//        Node left=null;
//        Node right=null;
//        Node(int value){
//            this.value=value;
//        }
//    }
//    public void insertionAtBinaryTree(Node root, int value) {
//        if (value < root.value) {
//            if (root.left != null)
//                insertionAtBinaryTree(root.left, value);
//            else{
//                System.out.println("Inserted " + value + " to left of " + root.value);
//                root.left = new Node(value);}}
//        else if (value > root.value) {
//            if (root.right != null)
//                insertionAtBinaryTree(root.right, value);
//            else {
//                System.out.println("Inserted " + value + " to right of " + root.value);
//                root.right = new Node(value);}
//        }
//    }
//
//    public void InOrder(Node root) {
//        if (root != null) {
//            InOrder(root.left);
//            System.out.print(" " + root.value);
//            InOrder(root.right);
//        }
//    }
//    public void PostOrder(Node root) {
//        if (root != null) {
//            InOrder(root.left);
//            InOrder(root.right);
//            System.out.print(" " + root.value);
//        }
//    }
//
//    public void PreOrder(Node root) {
//        if (root != null) {
//            System.out.print(" " + root.value);
//            InOrder(root.left);
//            InOrder(root.right);
//        }
//    }
//    public void LevelOrder(Node root){
//        int height=Height(root);
//        int v;
//        for(v=1; v<=height; v++){
//            CurrentLevel(root,v);
//            System.out.println();
//        }
//    }
//
//    public int Height(Node root){
//        if(root==null)
//            return 0;
//        return Math.max(Height(root.left),Height(root.right))+1;
//    }
//
//    public void CurrentLevel(Node root ,int level){
//        if(root==null)
//            return;
//        if(level==1)
//            System.out.print(" "+root.value);
//        else if(level>1){
//            CurrentLevel(root.left, level-1);
//            CurrentLevel(root.right,level-1);
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Tree.Exercise_9_BST eBST=new Tree.Exercise_9_BST();
//        System.out.println("\n **Enter -1 when you have entered your BST**\n");
//        System.out.print("Enter the ROOT value of the BST  --> ");
//        int rootValue=sc.nextInt();
//        Node root=new Node(rootValue);
//        for(int v=1; v<=100; v++){
//            System.out.print("Enter further values of BST --> ");
//            int value = sc.nextInt();
//            if(value!=-1)
//                eBST.insertionAtBinaryTree(root, value);
//            else
//                break;
//        }
//        System.out.println("\nInorder Traversal -:");
//        eBST.InOrder(root);
//        System.out.println();
//        System.out.println("PreOrder Traversal -:");
//        eBST.PreOrder(root);
//        System.out.println();
//        System.out.println("Postorder Traversal -:");
//        eBST.PostOrder(root);
//        System.out.println();
//        System.out.println("Level Traversal :-");
//        eBST.LevelOrder(root);
//    }
//}
