public class doublell {
    
    public class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

    public static Node head;
    public static Node tail;
    public static int size;

    //add 
    public void addfirst(int data){
        Node newNode = new Node(data);

        size++;
        if(head == null){
            head = tail = newNode;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public int removefirst(){
        if(head == null){
            System.out.println("Double Link List is Empty");
            return Integer.MIN_VALUE;
        }

        
        int val = head.data;
        head = head.next;
        head.prev = null;
        
        size++;
        
        return val;
    }


    public static void main(String[] args) {
        doublell dll = new doublell();

    }
}
