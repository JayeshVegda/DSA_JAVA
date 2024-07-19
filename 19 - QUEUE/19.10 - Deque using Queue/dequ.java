import java.util.Deque;
import java.util.LinkedList;

public class dequ {
    static class qu{
        static Deque<Integer> dq = new LinkedList<>();

        public static void push(int data){
            dq.addFirst(data);
        }


        public static int pop(){
           return dq.removeFirst();
        }

        public static int peek(){
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        
    }
}
