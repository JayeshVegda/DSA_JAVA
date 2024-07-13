import java.util.HashMap;
import java.util.Stack;

public class simple {
    public static int[] nextGreaterElement(int[] elements) {
        int n = elements.length;
        Stack<Integer> stk = new Stack<>();
        HashMap<Integer, Integer> hc = new HashMap<>();
        for(int i = n-1; i>=0; i--){
            while(!stk.isEmpty() && stk.peek() <= elements[i]){
                stk.pop();
            }

            if(stk.empty()){
                hc.put(elements[i], -1);
            }else{
                hc.put(elements[i], stk.peek());
            }
            stk.push(elements[i]);
        }


        for(int i = 0; i<n; i++){
            int key = elements[i];
            elements[i] = hc.get(key);
        }

        
        return elements;
    }

   
    public static void main(String[] args) {
        int[] a = {6, 8, 0, 1, 3};
        int[] ans = {8, -1, 1, 2, -1};
        nextGreaterElement(a);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }


    }
}
