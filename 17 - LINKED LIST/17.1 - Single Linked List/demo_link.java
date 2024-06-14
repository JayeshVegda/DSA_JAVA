class SingleLink {
    private Node head;
    private Node tail;
    private int size;
    
    public SingleLink() 
    {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private static class Node {
        private int value;
        private Node next;
        
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

public class demo_link{
    public static void main(String[] args) {
        SingleLink list = new SingleLink();
        list.addLast(5);
        list.addFirst(10);
        System.out.println("Size of the list: " + list.getSize());
        // You can add more operations to test the functionality of the SingleLink class
    }
}