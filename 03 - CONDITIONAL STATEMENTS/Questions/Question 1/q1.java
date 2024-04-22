// Write a Java program to get a number from the user and print whether it is positive or negative

import java.util.Scanner;

public class q1 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("Your Number is Positive");
        }
        else
        {
            System.out.println("Your Number is Negative");
        }
        sc.close();
    }
    
}
