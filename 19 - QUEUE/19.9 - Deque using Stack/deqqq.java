// deque = double ended queue
// deenque = 
import java.util.*;;
public class deqqq {
    static class stack {
        static Deque<Integer> dd = new LinkedList<>();

        public static void push(int data){
            dd.addLast(data);
        }

        public static int pop(){
            return dd.removeLast();
        }


        public static int peek(){
            return dd.getLast();
        }
        
    }


    public static void main(String[] args) {
        
    }
}
