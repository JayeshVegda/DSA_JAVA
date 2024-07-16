public class usingarray {
    static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    static class Queue{
        static Node head = null;
        static Node tail = null;

        // is Empty
        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        // add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
        }
        
        // remove
        public static int remove(){
            if(isEmpty()){
                System.out.println();
            }

            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }

            return front;
        }



        //peek  
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("- Your Queue is Empty.");
                return -1;
            }

            return head.data;
        }
    }
    
    public static void main(String[] args) {
        Queue que = new Queue();
        que.add(1);
        que.add(2);
        que.add(3);
        while (!que.isEmpty()) {

            System.out.println(que.peek());
            que.remove();
        }
    }
}
