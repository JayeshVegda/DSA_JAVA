public class usinglinkedlist {
    
    static class Node {
            
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }    
    }

    static class Stack {
    
        static Node head = null;

        //if Empty
        public static boolean CheckEmpt(){
            return head == null;
        }

        //get Size
        public static int mysize(){
            Node temp = head;
            int counter = 0;
            while(temp != null){
                temp = temp.next;
                counter++;
            }
            
            return counter;

        }

        // Push
        public static void push(int data){

            Node newNode = new Node(data);
            if(CheckEmpt()){
             head = newNode;
             return;
            }
            newNode.next = head;
            head = newNode;
        }

        // Pop
        public static int pop(){
            if(CheckEmpt()){
                head = null;
                return -1;
            }


            int top = head.data;
            head = head.next;
            return top;
        }

        // Peek
        public static int peek(){
            if(CheckEmpt()){
                head = null;
                return -1;
            }

            return head.data;
        }

    }
        


    public static void main(String[] args) {
        Stack sc = new Stack();
        sc.push(2);        
        sc.push(3);        
        sc.push(4);        
        sc.push(5);  
        System.out.println("My size is " + sc.mysize());
        
        StringBuilder res = new StringBuilder();

        while (!sc.CheckEmpt()) {
            System.out.println(sc.peek());
            int data = sc.pop();
            res.append(data);
        }

        System.out.println(res.toString());
    }
}
