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

    public void addlast(int data){
        Node newNode = new Node(data);

        size++;
        if(head == null){
            head = tail = newNode;
        }

        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void reverse(){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.prev;
        }


    }
    public static void main(String[] args) {
        doublell dll = new doublell();
        dll.addfirst(4);
        dll.addlast(22);
        dll.addfirst(2);
        dll.addlast(22);
        dll.addfirst(1);
        dll.addfirst(0);
        dll.print();
        dll.reverse();

    }
}
