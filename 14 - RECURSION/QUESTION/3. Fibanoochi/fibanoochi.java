public class fibanoochi {

    public static int createfibi(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return createfibi(n-1) + createfibi(n-2);
    }
    public static void main(String[] args) {
        System.out.println(createfibi(4));

    }
}
