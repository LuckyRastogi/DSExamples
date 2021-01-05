import node.*;

public class BFS {
    Node root;
    BFS(int key){
        root = new Node(key);
    }
    BFS(){
        this.root = null;
    }

    public int treeHeight(Node node){
        if (node == null)
            return 0;
        else {
            int lHeight = treeHeight(node.left);
            int rHeight = treeHeight(node.right);
            if (lHeight > rHeight){
                return lHeight + 1;
            } else {
                return rHeight + 1;
            }
        }
    }

    public void printLevelOrder(Node node){
        if (node == null)
            return;
        int height = treeHeight(node);
        for(int i=1;i<=height;i++){
            printGivenLevel(node, i);
        }
    }

    public void printGivenLevel(Node node, int level){
      if (level == 1){
          System.out.println(node.data);
      } else if(level > 1){
          printGivenLevel(node.left, level-1);
          printGivenLevel(node.right, level-1);
      }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        System.out.println(tree.treeHeight(tree.root));
        tree.printLevelOrder(tree.root);
    }
}
