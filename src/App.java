public class App {
    public static void main(String[] args) throws Exception {
        
        LinkedList linkedList = new LinkedList();
        Node nodeA = new Node("nó A");
        Node nodeB = new Node("nó B");
        Node nodeX = new Node("nó X");
        Node nodeZ = new Node("nó Z");
        Node nodeH = new Node("nó H");

        linkedList.addFirst(nodeX); 
        linkedList.addFirst(nodeB);
        linkedList.addFirst(nodeA); 

        linkedList.showLinkedList();
    }
}
