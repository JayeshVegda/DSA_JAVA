public class fact {
    public static void main(String[] args) {
        System.out.println(findfact(5));   
    }

    public static int findfact(int n ){
        if(n == 0){
            return 1;
        }
        int fn = n * findfact(n-1);
        return fn;

    }


}
