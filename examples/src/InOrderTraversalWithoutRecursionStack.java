import node.Node;

import java.util.Stack;


public class InOrderTraversalWithoutRecursionStack {
    Node root;
    Node parent;
    public InOrderTraversalWithoutRecursionStack(){
        this.root = null;
    }

    public void printInOrder(Node root){
        if(root == null)
            return;
        Node current = parent = root;
        while(current != null){
            parent = current;
            current = current.left;
        }
        System.out.println(current.data);

        if (parent != null){
            System.out.println(parent.data);
            current = parent.right;
            if(current != null){
                System.out.println(current.data);
            }

        }

    }

    public static void main(String[] args) {
        InOrderTraversalWithoutRecursionStack tree = new InOrderTraversalWithoutRecursionStack();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printInOrder(tree.root);
    }
}

