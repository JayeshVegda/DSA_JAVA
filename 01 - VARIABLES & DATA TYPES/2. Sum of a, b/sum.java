import java.util.*;

public class sum {
    static void sum(int a, int b){
        int c = a + b;
        System.out.print("Sum of " + a + " and " + b + " is : " + c); 
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the first : ");
        int a = scanner.nextInt();
        System.out.print("Enter the second : ");
        int b = scanner.nextInt();

        sum(a, b);
    }

}
