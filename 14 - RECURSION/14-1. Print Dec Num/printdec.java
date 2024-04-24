
public class printdec {
    public static void printo(int n){
        if(n == 1){
            System.out.print(n + ", ");
            return;
        }
        System.out.print(n + ", ");
        printo(n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        printo(n);
    }    
}
