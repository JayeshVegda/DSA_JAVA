import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * quqe
 */
public class quqe {

    public static void main(String[] args) {
        Queue myq = new LinkedList<>();
        Queue myqt = new ArrayDeque<>();

        myq.add(2);
        myq.add(2);
        myq.add(3);

        while(!myq.isEmpty())
        {
            System.out.println(myq.peek());
            myq.remove();
        }
    }
}