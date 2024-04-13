import java.util.Scanner;

public class pyramid  {
    public static void pat(int totalrow){

            int n = totalrow;
            //outer Loop 
            for(int i = 1; i <=n; i++)
            {
                //inner loop

                // make spaces 
                for(int j = 1; j <= (n-i); j++){
                    System.out.print(" ");
                }

                //make star 
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }

                
                System.out.println();
            }
        }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Enter Number of Rows : ");
        int row = sc.nextInt();
        pat(row);
        sc.close();
    }
}

