
public class fibi {
    public static void main(String[] args) {
        System.out.println(fibina(24));
    }   
    
    public static int fibina(int n ){
        if(n == 0 || n == 1){
            return n;
        }

        int fn1 = fibina(n - 1);
        int fn2 = fibina(n - 2);
        return fn1 + fn2;
    }
}
