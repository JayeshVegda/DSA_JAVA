import java.util.Scanner;


public class hollow {
    public static void pat(int totalrow, int totalcol){
        for(int i = 1; i<=totalrow; i++){
            for(int j=1; j<=totalcol; j++){
                if(i == 1 || i == totalrow || j == 1 || j == totalcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Enter Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("- Enter Number of Col : ");
        int col = sc.nextInt();
        pat(row, col);
        sc.close();
    }
}

