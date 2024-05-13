package Tree;

public class NodeTree {
    public int val;
    public NodeTree left;
    public NodeTree right;
    public NodeTree() {}
    public NodeTree(int val) { this.val = val; }
    NodeTree(int val, NodeTree left, NodeTree right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}