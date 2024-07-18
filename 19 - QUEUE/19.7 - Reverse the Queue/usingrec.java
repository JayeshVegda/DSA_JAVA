import java.util.LinkedList;
import java.util.Queue;

public class usingrec {
    public static void rec(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }

        int top = q.remove();
        rec(q);
        q.add(top);
    }
    public static void main(String[] args) {
        Queue q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(4);

        
        System.out.println("Original Queue: " + q);
        
        rec(q);

        System.out.println("Reversed Queue: " + q);
    }
}
