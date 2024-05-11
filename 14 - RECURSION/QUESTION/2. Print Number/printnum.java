public class printnum {
    static void print(int i, int n){
    if(i >= n){
        return;
    }


    print(i+1, n);
    System.out.println(i);
}

    public static void main(String[] args) {
        print(5, 15);
    }
}
