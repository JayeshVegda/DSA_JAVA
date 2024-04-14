import java.util.Scanner;


public class pyramid {
    public static void peramid(int num){
        int n = num;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Enter Number of Rows : ");
        int row = sc.nextInt();
        peramid(row);
        sc.close();
    }
}
