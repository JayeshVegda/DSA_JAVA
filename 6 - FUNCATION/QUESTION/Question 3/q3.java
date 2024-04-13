import java.util.Scanner;

public class q3 {
    public static void checkpali(int num){
        int real = num;
        int rev = 0;

        while(num>0){
            rev = (rev * 10) +  (num%10);
            num = num / 10;
        }

        if(real == rev){
            System.out.println("Number " + real + " is Palindrome of " + rev);
        }
        else{
            System.out.println("Number " + real + " is not a Palindrome");
            
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter Your Number : ");
        int num = sc.nextInt();
        checkpali(num);
        sc.close();
    }
}
