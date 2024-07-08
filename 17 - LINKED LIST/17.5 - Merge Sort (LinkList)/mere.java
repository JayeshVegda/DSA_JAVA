public class mere {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }
    Node head;
    public void append(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    // find a middle point
    public Node getmiddle() 
    {
      Node slow = head;
      Node fast = head.next;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2){
        Node mergedll = new Node(-1);
        Node temp =     mergedll;
        while (head1 != null && head2 != null) {
            if(head1.data <= head2.data){
                temp.next = head
            }
        }
    }

    public Node mergeSort(Node head){
        if(head == null && head.next == null){
            return head;
        }

        Node mid = getmiddle();
        Node Right = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(Right);
    }

    

      // Find Meeting Point
    
    }

    public static void main(String[] args) {
        Remove list = new Remove();

        // Creating a linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        // Creating a loop for testing
        list.head.next.next.next.next.next = list.head.next;

        list.detectAndRemoveLoop();
        System.out.println("Linked List after removing loop: ");
        list.printList();
    }
}
