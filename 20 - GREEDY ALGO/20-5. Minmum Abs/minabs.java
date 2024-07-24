import java.util.Arrays;

public class minabs {
    public static void main(String[] args) {
        int A[] = {2,3,4,5,6};
        int B[] = {1,2,3,4,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int min=0;
        for(int i = 0; i<A.length; i++){
            min+=Math.abs(A[i] - B[i]);
        }


        System.out.println(min);
    }
}
