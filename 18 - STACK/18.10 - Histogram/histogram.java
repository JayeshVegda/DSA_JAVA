import java.util.Stack;

public class histogram {
    public static int reactagle(int[] arr){
        int n = arr.length;
        int[] nsl = new int[n];
        int[] nsr = new int[n];
        int max = Integer.MIN_VALUE;
        Stack<Integer> stk = new Stack<>();


        // next smaller right
        for(int i = n - 1; i>=0; i--){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsr[i] = n;
            }else{
                nsr[i] = stk.peek();
            }

            stk.push(i);
        }

        stk = new Stack<>();
        // next smaller right
        for(int i = 0; i<n; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(stk.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = stk.peek();
            }

            stk.push(i);
        }

        // calc area | wid = j - i - 1  
        for(int i = 0; i<n; i++){
            int h = arr[i];
            int w = nsr[i] - nsl[i] - 1;
            int curr = h * w;
            max = Math.max(curr, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(reactagle(arr));
    }
}
