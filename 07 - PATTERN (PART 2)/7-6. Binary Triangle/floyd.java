import java.util.Scanner;

public class floyd {
    public static void pat(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j<i; j++){
                if(((i+j)%2) != 0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("- Enter Number of Rows : ");
       // int row = sc.nextInt();
        pat(5);
        sc.close();
    }
}
