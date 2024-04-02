// Question 1 : In a program, input 3 numbers : A, B and C.
// You have to output the average of these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

import java.util.Scanner;

public class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter A : ");
        int a = sc.nextInt();
        System.out.print("Enter B : ");
        int b = sc.nextInt();
        System.out.print("Enter C : ");
        int c = sc.nextInt();

        int avg = a + b + c / 3;
        System.out.println("Avarage of these 3 number : " + avg);
        
    }
}