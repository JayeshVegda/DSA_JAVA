
public class right_p {
    public static void main(String [] args){
        int line = 4;
        char star = '*';
        for(int i = 1; i <= line; i++)
        {
            int space = line - i;
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
