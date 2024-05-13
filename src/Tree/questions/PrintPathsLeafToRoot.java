package Tree.questions;

import Tree.NodeTree;

import java.util.ArrayList;
import java.util.List;

public class PrintPathsLeafToRoot {

    public static void main(String[] args) {
        NodeTree root = new NodeTree('a');
        root.left = new NodeTree('b');
        root.right = new NodeTree('C');
        root.left.left = new NodeTree('d');
        root.left.right = new NodeTree('e');
        root.right.left = new NodeTree('d');
        root.right.right = new NodeTree('e');
        ArrayList<String> list = new ArrayList<String>();
        StringBuilder sb = new StringBuilder();
        smallestFromLeafHelper(root, list, sb);
        System.out.println(list);


    }

    public static void smallestFromLeafHelper(NodeTree root, List<String> list, StringBuilder sb) {
        if (root == null) return;
        sb.append((char) ('a' + root.val - 97));
        if (root.left == null && root.right == null) {
            list.add(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
        }
            smallestFromLeafHelper(root.left, list, sb);
            smallestFromLeafHelper(root.right, list, sb);


    }

}
