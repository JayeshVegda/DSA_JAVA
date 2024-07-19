import java.util.LinkedList;
import java.util.Queue;

public class interval {
    public static Queue inter(Queue<Integer> q){
        int n = q.size();
        int counter = 0;
        System.out.println(n /2 );
        Queue<Integer> res = new LinkedList<>();
        Queue<Integer> first = new LinkedList<>();
        
        while (counter != (n/2)) {
            first.add(q.remove());
            counter++;
        }

        for(int i = 0; i<n; i++){
            if(i%2 == 0){
                res.add(first.remove());
            }else{
                res.add(q.remove());
            }
        }

        return res; 

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(0);


        System.out.println(inter(q));


    }
}
