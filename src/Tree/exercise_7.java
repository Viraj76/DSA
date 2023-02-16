package Tree;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;



public class exercise_7 {



    static  Node creatingBinaryTree(){
        int value;
        Scanner sc=new Scanner(System.in);
        Node root=null;

        System.out.print("Enter the value -->   ");
        value=sc.nextInt();
        if(value==-1) return null;
        root=new Node(value);
        System.out.print("Enter the LEFT child value of the --> "+root.value+", ");
        root.left=creatingBinaryTree();
        System.out.print("Enter the RIGHT child value of the --> "+root.value+", ");
        root.right=creatingBinaryTree();
        return root;
    }
    static void preorder(Node root){    //NLR
        if(root==null)
            return;

        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);

    }
    static int size(Node root){
        if(root==null)
            return 0;
        else
            return (size(root.left)+1+size(root.right));
    }
    static void inorder(Node root){    //LNR
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    static void postorder(Node root){    //LRN
        if(root==null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    static  void delete(Node root){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            if(root.value== 40){
                root=null;
            }
            return;
        }                                                                   //                  10
        Queue<Node> q= new LinkedList<>();                                  //               /      \
        q.add(root);                                                        //              13       8
        Node temp=null;                                                     //          /     \     /  \
        //          6      40  5     23
        Node valueNode=null;
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.value== 40)
                valueNode=temp;
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }

        if(valueNode!=null){
            int x=temp.value;
            deleteDeepest(root,temp);
            valueNode.value=x;
        }
    }
    private static void deleteDeepest(Node root, Node delNode) {
        Queue<Node> q=new LinkedList<Node>();
        q.add(root);
        Node temp=null;
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp==delNode){
                temp=null;
                return;
            }
            if(temp.right!=null){
                if(temp.right==delNode){
                    temp.right=null;
                    return;
                }
                else
                    q.add(temp.right);
            }
            if(temp.left!=null){
                if(temp.left==delNode){
                    temp.left=null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Enter -1 for skipping further child values\n");
        Node root=creatingBinaryTree();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

        int size=size(root);
        System.out.println();
        System.out.println(size);
        delete(root);

        System.out.println();
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);

    }
}
