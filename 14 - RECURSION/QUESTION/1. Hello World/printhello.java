public class printhello {
    static void hello(int n){
        if(n == 0){
            return;
        }

        System.out.println("Hello World");
        hello(n - 1);
    }

    public static void main(String[] args) {
        hello(5);
    }
}
