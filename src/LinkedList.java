public class LinkedList {
    Node head = null;
    Node tail = null;
    Node next = null;
    int size = 0;
    
    public int size() {
        return this.size;
    }

    public boolean isEmpty(){
        return this.size() == 0 ? true: false;
    }

    public void addFirst(Node node) {
        if(this.size() == 0) {
            node.next = null;
            this.head = node;
            this.tail = node;
            this.size++;
        } else if(this.size() > 0) {
            node.next = this.head;
            this.head = node;
            this.size++;
        }
    }

    public void addLast(Node node) {
        node.next = null;
        this.tail.next = node;
        this.tail = node;
        this.size++;
    }

    public void removeFirst (){
        if(this.head == null) {
            System.out.println("Impossivel remover de uma lista vazia.");
        } else if(this.head.next == null){
            this.head = null;
            this.tail = null;
            this.size = 0;
        } else if(this.head.next != null){
            this.head = this.head.next;
            this.size--;
        }
    }

    public void removeLast() {
        Node itemList = this.head;
        while(itemList != null) {
            if(itemList.next == null) {
                this.tail = null;
                this.head = null;
                this.size = 0;
                return;
            } else if(itemList.next != null && itemList.next.next == null) {
                itemList.next = null;
                this.tail = itemList.next;
                this.size--;
                return;
            } else {
                itemList = itemList.next;
            }
        }
    }

    public boolean search(Node element){
        boolean status = false;
        Node itemList = this.head;
        
        while(itemList != null) {
            if(itemList.data == element.data) {
                status = true;
                return status;
            } else {
                status = false;
                itemList = itemList.next;
            }
        }
        return status;
    }

    public void showLinkedList(){
        Node list = this.head;
        while(list != null) {
            if(list.next != null) {
                System.out.println(list.data);
                list = list.next;
            } else if(list.next == null) {
                System.out.println(list.data);
                return;
            }
        }
    }    

    public void remove (Node item) {
        Node itemList = this.head;

        while(itemList != null) {
            if(itemList.data == item.data && itemList.next == null) {
                removeFirst();
                return;
            } else if(itemList.data == item.data && itemList.next != null) {
                this.head = itemList.next;
                this.size--;
                return;
            } else if(itemList.next.data == item.data && itemList.next.next != null) {
                itemList.next = itemList.next.next;
                this.size--;
                return;
            } else if(itemList.next.data == item.data && itemList.next.next == null) {
                removeLast();
                return;
            } else {
                itemList = itemList.next;
            }
        }
    }

    public void showNext(){
        if(this.head.next != null) {
            System.out.println(this.head.next.data);
        } else {
            System.out.println("null");
        }
    }

    public void showHead(){
        if(this.head != null){
            System.out.println("H: "+this.head.data);
        } else {
            System.out.println("Vazio.");
        }   
    }

    public void showTail(){
        if(this.tail != null){
            System.out.println("T: "+this.tail.data);
        } else {
            System.out.println("Vazio.");
        }
    }
}
