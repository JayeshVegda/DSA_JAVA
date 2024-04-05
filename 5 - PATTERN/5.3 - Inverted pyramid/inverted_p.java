public class inverted_p {
    public static void main(String [] args){
        int line = 4;
        char star = '*';

        for(int i = 1; i <= line; i++)
        {
            for(int j = line; j >= i; j = j-1){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
