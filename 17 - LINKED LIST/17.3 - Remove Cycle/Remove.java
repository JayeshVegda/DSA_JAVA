public class Remove {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    Node head;

    // Function to insert a new Node at the end of the list
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

    // Function to print the linked list
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    // Function to detect and remove loop in the list
    public void detectAndRemoveLoop() {
      // Detect the Loop 
      Node slow = head;
      Node fast = head;
      Boolean check = false;
      while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            check = true;
            break;
        }
      }

      // Find Meeting Point
      Node prev = null;
      if(check == true){
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }
      }
      // Remove Cycle -> prev = null;
      prev.next = null;

      return;
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
