public class subarray {
    public static void dosub(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.println("Outer loop iteration: " + i);
            for (int j = i; j <= num.length; j++) {
                System.out.println("  Middle loop iteration: " + j);
                for (int k = i; k < j; k++) {
                    System.out.println("    Inner loop iteration: " + k);
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args){
        int num[] = {3,5,6,7,2};
        dosub(num);
    }
}
