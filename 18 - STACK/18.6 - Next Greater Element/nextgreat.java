import java.util.HashMap;
import java.util.Stack;

public class nextgreat {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] res = new int[n1];

        Stack<Integer> sc = new Stack<>();
        HashMap<Integer, Integer> hc = new HashMap<>();


        for(int i = 0; i<n2; i++)
        {
            if(sc.isEmpty()){
                sc.push(nums2[i]);
            }


            while(!sc.isEmpty() && sc.peek() < nums2[i]){
                int top = sc.pop();
                hc.put(top, nums2[i]);
            }

            sc.push(nums2[i]);
        }

        while(sc.size() != 0){
            hc.put(sc.pop(), -1);
        }

        for(int i = 0; i<n1; i++){
            nums1[i] = hc.get(nums1[i]);
        }


        return nums1;
    }


    public static void printarr(int[] a){
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }    
    }

    public static void main(String[] args) {
        int[] a = {4,1,2};
        int[] b = {1,3,4,2};


        System.out.println(nextGreaterElement(a, b));
        printarr(a);
    }
}
