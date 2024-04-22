import java.util.Scanner;

public class solid {
    public static void rhambus(int n){
       //outer loop
        for(int i =1; i<=n; i++)
        {
            //space
            for(int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //star
            for(int j = 1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("- Enter Number of Rows : ");
       // int row = sc.nextInt();
       rhambus(5);
        sc.close();
    }
}
