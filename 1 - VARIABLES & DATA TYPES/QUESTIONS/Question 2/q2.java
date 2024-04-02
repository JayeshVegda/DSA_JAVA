/* Question2:In a program,input the side of a square.You have to output the area of the square.
(Hint : area of a square is (side x side)) */

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X side : ");
        int x = sc.nextInt();
        System.out.print("Enter Y side : ");
        int y = sc.nextInt();

        System.out.println("Area of a Sqaure is : " + (x*y));
    }  
}
