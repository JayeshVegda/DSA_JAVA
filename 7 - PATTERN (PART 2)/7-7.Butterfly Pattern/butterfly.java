import java.util.Scanner;

public class butterfly {
    public static void butter(int n){
       //outer loop
       for(int i = 1; i <= n; i++)
       {
            //star - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // space = 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i = n; i >= 1; i--)
        {
            //star - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            // space = 2*(n-i)
            for(int j = 1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //star - i
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("- Enter Number of Rows : ");
       // int row = sc.nextInt();
        butter(5);
        sc.close();
    }
}
