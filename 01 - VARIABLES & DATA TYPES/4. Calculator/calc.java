import java.util.Scanner;

public class calc {
    static void clean(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    static void next(){
        System.out.println("Press 0 to exit or enter to continue...");
        Scanner sc = new Scanner(System.in);
        String nex = sc.nextLine();  
        // consume the
        if(nex == 0){
            System.Exit(0);
        }else{

        }
    }
    static void result(int chose, int a, int b, String c){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        Scanner res = new Scanner(System.in);

        if(c == "0"){
            System.exit(0);
        }
        else{
            switch (chose) {
                case 1:
                    clean();
                    System.out.println("Sum of A " + a + " and B " + b + " is : " + (a+b));
                    System.out.print();
                    String nex = res.nextLine();
                    if
                    break;

                case 2:
                    clean();
                    System.out.println("Multipliction of A " + a + " and B " + b + " is : " + (a*b));
                    break;
                    
                case 3:
                    clean();
                    System.out.println("Division of A " + a + " and B " + b + " is : " + (a/b));
                    break;
                    
                case 4:
                    clean();
                    System.out.println("Subtrack of A " + a + " and B " + b + " is : " + (a-b));
                    break;
                
                case 5:
                    clean();
                    System.exit(0);
            
                default:
                    clean();
                    break;
            }
        }
    }
    static void getValue(int chose){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  

        Scanner in = new Scanner(System.in);

        System.out.println("1. Enter Your First Number : " );
        int a = in.nextInt();
        System.out.println("2. Enter Your Second Number : " );
        int b = in.nextInt();
        System.out.println("3. Hit Enter to Perfrom or 0 to Exit.....");
        String c = in.nextLine();
        result(chose, a, b, c);
        in.close();
    }
    static void mainmenu(){
        Scanner sc = new Scanner(System.in);
        boolean status = true;
        while(status){
            clean();
            System.out.println("Welcome to my Calculator");
            System.out.println("------------------------");
            System.out.println("1. Addition");
            System.out.println("2. Multiplay");
            System.out.println("3. Division");
            System.out.println("4. Subtrack");
            System.out.println("5. Exit");
            System.out.print("Chose the Number : ");
            int chose = sc.nextInt();
            if(chose < 5){
                getValue(chose);
            }
            else if(chose == 5){
                System.exit(0);
            }
            else{
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println("Enter Again");
            }
        }
    }
    }
    public static void main(String[] args){

        CalcualtorMain cm = new CalcualtorMain();
        
}
