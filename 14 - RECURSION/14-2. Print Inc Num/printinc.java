
public class printinc {
    public static void printo(int n){
        if(n == 1){
            System.out.print(n + ", ");
            return;
        }
        printo(n-1);
        System.out.print(n + ", ");
    }
    public static void main(String[] args) {
        int n = 10;
        printo(n);
    }    
}
