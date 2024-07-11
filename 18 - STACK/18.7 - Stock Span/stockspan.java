import java.util.Stack;

public class stockspan {
    public static int[] stock(int[] total){
        int n = total.length;
        int[] span = new int[n];
        Stack<Integer> stk = new Stack<>();

        span[0] = 1;

        for(int i = 1; i<n; i++)
        {
            while (!stk.isEmpty() && total[stk.peek()] <= total[i])
            {
                stk.pop();
            }

            if(stk.size() == 0)
            {
                span[i] = i + 1;
            }
            else
            {
                spans[i] = i - stk.peek();
            }
            
            stk.push(i);
        }


        return span;
    }
    public static void main(String[] args) {
        int[] mydata = {100, 80, 60, 70, 60, 85, 110};
        stock(mydata);

    }
}
