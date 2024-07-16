public class usingarray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }

        // is Empty
        public static boolean isEmpty(){
            return rear == -1;
        }

        // add
        public static void add(int data){
            if(rear == size - 1){
                System.out.println(" - Your Queue is Full.");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }
        
        // remove
        public static int remove(){
            if(isEmpty())
            {
                System.out.println("- Your Queue is Empty.");
                return -1;
            }

            int front = arr[0];
            for(int i = 0; i<rear; i++){
                arr[i] = arr[i + 1];
            }

            rear = rear - 1;

            return front;
        }

        //peek  
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("- Your Queue is Empty.");
                return -1;
            }

            return arr[0];
        }
    }
    public static void main(String[] args) {
        Queue que = new Queue(3);
        que.add(1);
        que.add(2);
        que.add(3);
        while (!que.isEmpty()) {
            
            System.out.println(que.peek());
            que.remove();
        }
    }
}
