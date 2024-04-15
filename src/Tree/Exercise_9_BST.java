package Tree;

import java.util.*;
public class Exercise_9_BST {
    static class Node{
        int value;
        Node left=null;
        Node right=null;
        Node(int value){
            this.value=value;
        }
    }
    public void insertionAtBinaryTree(Node root, int value) {
        if (value < root.value) {
            if (root.left != null)
                insertionAtBinaryTree(root.left, value);
            else{
                System.out.println("Inserted " + value + " to left of " + root.value);
                root.left = new Node(value);}}
        else if (value > root.value) {
            if (root.right != null)
                insertionAtBinaryTree(root.right, value);
            else {
                System.out.println("Inserted " + value + " to right of " + root.value);
                root.right = new Node(value);}
        }
    }

    //Recursively
    public void InOrder(Node root) {
        if (root != null) {
            InOrder(root.left);
            System.out.print(" " + root.value);
            InOrder(root.right);
        }
    }
    public void PostOrder(Node root) {
        if (root != null) {
            InOrder(root.left);
            InOrder(root.right);
            System.out.print(" " + root.value);
        }
    }
    public void PreOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.value);
            InOrder(root.left);
            InOrder(root.right);
        }
    }
    public void LevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currentNode=q.poll();
            if(currentNode==null){
                if(q.isEmpty())
                    return;
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(currentNode.value+" ");
            if(currentNode.left!=null)
                q.add(currentNode.left);
            if(currentNode.right!=null)
                q.add(currentNode.right);
        }
    }

    //Iteratively
    public void Inorder(Node root){
        List<Integer> list=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        while(root!=null || !stk.isEmpty()){

            while(root!=null){
                stk.add(root.value);
                root=root.left;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercise_9_BST eBST=new Exercise_9_BST();
        System.out.println("\n **Enter -1 when you have entered your BST**\n");
        System.out.print("Enter the ROOT value of the BST  --> ");
        int rootValue=sc.nextInt();
        Node root=new Node(rootValue);
        for(int v=1; v<=100; v++){
            System.out.print("Enter further values of BST --> ");
            int value = sc.nextInt();
            if(value!=-1)
                eBST.insertionAtBinaryTree(root, value);
            else
                break;
        }
        System.out.println("\nInorder Traversal -:");
        eBST.InOrder(root);
        System.out.println();

        System.out.println("PreOrder Traversal -:");
        eBST.PreOrder(root);
        System.out.println();

        System.out.println("Postorder Traversal -:");
        eBST.PostOrder(root);
        System.out.println();

        System.out.println("Level Order Traversal :-");
        eBST. LevelOrder(root);
        System.out.println();


    }
}
