// Write a Java method to compute the averageof three numbers
import java.util.Scanner;

public class q1 {
 public static int average(int a, int b, int c){
    return (a +   b +  c) / 3;
 }

 public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print(" - Enter Your First Number : ");
    int a = sc.nextInt();
    System.out.print(" - Enter Your Second Number : ");
    int b = sc.nextInt();
    System.out.print(" - Enter Your Third Number : ");
    int c = sc.nextInt();

    System.out.println();
    System.out.println(" => Average of " + a + ", " + b + ", " + c +" is " + average(a, b, c));
    sc.close();

}
}