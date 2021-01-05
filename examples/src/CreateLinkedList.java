class Node {
    int data;
    Node next;
    Node(){
    }
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class CreateLinkedList {
    public static void main(String args[]){
        Node node = new Node();
        for(int i=1; i<=5; i++){
            Node n = new Node(i, node);
        }
        for(int i=1; i<=5; i++){
            Node n = new Node(i, node);
        }

    }
}
