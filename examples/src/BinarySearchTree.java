import node.*;
public class BinarySearchTree {
    Node root;
    BinarySearchTree(int key){
        root = new Node(key);
    }
    BinarySearchTree(){
        this.root = null;
    }

    public void printInOrder(Node node){
        if(node == null)
            return;
        printInOrder(node.left);
        System.out.println(node.data + " ");
        printInOrder(node.right);
    }

    public void printPreOrder(Node node){
        if(node == null)
            return;
        System.out.println(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if (node == null)
            return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("In order traversal");
        tree.printInOrder(tree.root);
        System.out.println("Pre order traversal");
        tree.printPreOrder(tree.root);
        System.out.println("Post order traversal");
        tree.printPostOrder(tree.root);
    }
}
