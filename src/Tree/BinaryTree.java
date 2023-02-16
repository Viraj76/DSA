package Tree;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
class Node{
    int value;
    Node left,right;
    Node(int value){
        this.value=value;
        left=null;
        right=null;
    }
}
public class BinaryTree {
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
    static void inorder(Node root){    //LNR
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    static Node MergeTrees(Node firstTree, Node SecondTree) {
        if (firstTree == null)
            return SecondTree;
        if (SecondTree == null)
            return firstTree;
        firstTree.value += SecondTree.value;
        firstTree.left = MergeTrees(firstTree.left, SecondTree.left);
        firstTree.right = MergeTrees(firstTree.right, SecondTree.right);
        return firstTree;
    }
    static  void delete(Node root,int delValue){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            if(root.value== delValue){
                root=null;
            }
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        Node temp=null;

        Node valueNode=null;
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.value== delValue)
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
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter -1 for skipping further child values\n");

        System.out.println("Enter the values for first Binary Tree");
        Node Binary_tree_1= creatingBinaryTree();
        System.out.println("\nEnter the values for Second Binary Tree");
        Node Bt2=creatingBinaryTree();
        System.out.println("\nThe first Binary Tree is(Inorder)");
        inorder(Binary_tree_1);
        System.out.println();
        System.out.println("The Second Binary Tree is(Inorder)");
        inorder(Bt2);
        System.out.println();
        System.out.print("\nEnter the value for deletion in FIRST BINARY TREE (Value should be in the tree!!) --> ");
        int d1=sc.nextInt();
        delete(Binary_tree_1,d1);
        System.out.println("Value "+d1+" ,is deleted");
        System.out.print("Enter the value for deletion in SECOND BINARY TREE (Value should be in the tree!!) --> ");
        int d2=sc.nextInt();
        delete(Bt2,d2);
        System.out.println("Value "+d2+" ,is deleted");
        System.out.println("\nThe Merged Tree is");
        Node mergedTrees= MergeTrees(Binary_tree_1,Bt2);
        inorder(mergedTrees);
    }
}
