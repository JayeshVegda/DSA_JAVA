import java.util.Scanner;


public class hollow {
    public static void pat(int totalrow){
        for(int i = 1; i<=totalrow; i++){
            for(int j = 1; j<=(totalrow-i); j++){
                System.out.print(" ");
            }

            for(int j=1; j<=totalrow; j++){
                if(i == 1 || i == totalrow || j == 1 || j == totalrow){
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
        int col = sc.nextInt();
        pat(col);
        sc.close();
    }
}

