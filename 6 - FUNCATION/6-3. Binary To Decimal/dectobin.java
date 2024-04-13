public class dectobin {
    public static void dectobin(int mynum){
        int decimal = mynum; // 7 | 3 | 1
        int pow = 0;  // 0 | 1 | 2
        int decnum = 0; // 1 | 1 |

        while(mynum>0){
            int rem = mynum % 2; // 7%2 = 1 reminder | 3%2 = 1 | 1%2 = 1
            decnum = decnum + (rem * (int) Math.pow(10, pow)); // 0 + (1 * 1) ==== 1 |  1 + (1*10) === 11 | 11 + (1*10) = 111
            pow++; // pow(0) = 0 + 1 = 1 | 1+1 = 2 | 2+1 = 3
            mynum = mynum/2; // mynum = 7/2 = 3.5 | 3.5/2 = 1 | 1/2 = 0 
            System.out.println("My number " + mynum);
            System.out.println("Reminder " + rem);
            System.out.println("Power " + pow);
            System.out.println("Decimal " + decnum);
            System.out.println();
        }
        System.out.println("Binary Form of : "+ decimal +" ="+ decnum);
    }

    public static void main(String [] args){
        dectobin(7);
    }
}
