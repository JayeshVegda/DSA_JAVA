import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * questack
 */
public class questack {

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stk = new Stack<>();
        
        while (!q.isEmpty()) {
            stk.add(q.remove());
        }

        while (!stk.isEmpty()) {
            q.add(stk.pop());

        }
    }

     public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("Original Queue: " + queue);

        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }
}