
public class left_p {
    public static void main(String [] args){
        int line = 4;
        char star = '*';
        for(int i = 1; i <= line; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }    
}
