import node.Node;

import java.util.Stack;

public class InOrderTraversalWithoutRecursion {
    Node root;
    public InOrderTraversalWithoutRecursion(){
        this.root = null;
    }

    public void printInOrder(Node root){
        if(root == null)
            return;
        Node current = root;
        Stack<Node> stack = new Stack<>();
        while (current !=null || stack.size() > 0){
            while (current != null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.data);
            current = current.right;
        }
    }

    public static void main(String[] args) {
        InOrderTraversalWithoutRecursion tree = new InOrderTraversalWithoutRecursion();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printInOrder(tree.root);
    }
}
