import java.util.Scanner;

public class prime 
{

    public static boolean isPrime(int myprime)
    {
        if(myprime == 2)
        {
            return true;
        }else
        {
        
        for(int i = 2; i<=Math.sqrt(myprime); i++){
            if((myprime % i) == 0){
                return false;
            }
        }
        }
        return true;
    }

    public static void primerage(int range){
        for(int i = 2; i<=range; i++){
            if(isPrime(i)){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    public static void main(String [] args)
    {   
        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter Your Number : ");
        int input_prime = sc.nextInt();
        primerage(input_prime);
        /*
        if(result == true){
            System.out.println("Your Number " + input_prime + " is a Prime Number");
        }else{
            System.out.println("Your Number " + input_prime + " is not a Prime Number");
        } */
        sc.close();
    }
}

