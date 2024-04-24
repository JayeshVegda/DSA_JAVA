public class nat {
    public static void main(String[] args) {
        System.out.println(nature(5));

    }


    public static int nature(int n){
        if(n == 1){
            return 1;
        }

        return (n + nature(n-1));
    }
}
