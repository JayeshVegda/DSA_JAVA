import java.util.Queue;
import java.util.Stack;

public class questack {

    static class QueueB {
        static Stack<Integer> stk1 = new Stack<>();
        static Stack<Integer> stk2 = new Stack<>();

        public static boolean isEmpty(){
            return stk1.isEmpty();
        }

        public static void add(int data){
            while (!stk1.isEmpty()) {
                stk2.push(stk1.pop());
            }

            stk1.add(data);

            while (!stk2.isEmpty()) {
                stk1.push(stk2.pop());
            }
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Your Queue is Empty.");
                return -1;
            }
            return stk1.pop();
        } 

        public static int peeko(){
            if(isEmpty()){
                System.out.println("Your Queue is Empty.");
                return -1;
            }
            return stk1.peek();
        } 

    }

    public static void main(String[] args) {
        QueueB qb = new QueueB();
        qb.add(1);
        qb.add(2);
        qb.add(3);
        qb.add(4);
        qb.add(5);
        while (!qb.isEmpty()) {
            System.out.println(qb.peeko());
            qb.remove();
        }
    }
}
