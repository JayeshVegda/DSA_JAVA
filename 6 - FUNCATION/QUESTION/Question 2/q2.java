// riteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod
import java.util.Scanner;
public class q2 {
    public static Boolean isEven(int num){
        if((num%2) == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter Your Number : ");
        int a = sc.nextInt();
        System.out.println(" => Number "+ a +" is Even = " + isEven(a));
        sc.close();
    
    }
}
