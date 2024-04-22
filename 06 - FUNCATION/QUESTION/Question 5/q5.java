import java.util.Scanner;

public class q5 {
    public static void sum(int num) {
        int real = num;
        int sum = 0;

        while(num>0){
            sum = sum + (num%10);
            num = num / 10;
        }     

        System.out.println("= Sum of Digit is " + sum);

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("- Enter Your Number : ");
        int num = sc.nextInt();
        sum(num);
        sc.close();
    }


}
