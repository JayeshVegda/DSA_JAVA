import java.util.Scanner;

public class floyd {
    public static void pat(int n){
        int counter = 1;

        for(int i = 1; i <= n; i++){
         
            for(int j = 1; j<=i; j++){
                System.out.print(counter);
                counter++;
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
