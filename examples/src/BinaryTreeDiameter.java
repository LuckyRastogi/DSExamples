import node.*;

public class BinaryTreeDiameter {
    Node root;
    BinaryTreeDiameter(int key){
        root = new Node(key);
    }
    BinaryTreeDiameter(){
        this.root = null;
    }

    int diameter(Node node){
        if (node == null)
            return 0;
        int lHeight = height(node.left);
        int rHeight = height(node.right);
        int lDiameter = diameter(node.left);
        int rDiameter = diameter(node.right);
        return Math.max(lHeight+rHeight+1, Math.max(lDiameter, rDiameter));
    }

    int height(Node node){
        if(node == null)
            return 0;
        return 1+ Math.max(height(node.left),height(node.right));
    }
    public static void main(String[] args) {
        BinaryTreeDiameter tree = new BinaryTreeDiameter();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.right.left = new Node(8);
        tree.root.left.right.right = new Node(9);
        tree.root.left.right.right.left = new Node(10);

        tree.root.right.right = new Node(6);
        tree.root.right.right.right = new Node(7);
        System.out.println(tree.height(tree.root.left));
        System.out.println(tree.height(tree.root.right));
        System.out.println(tree.diameter(tree.root));

    }
}
