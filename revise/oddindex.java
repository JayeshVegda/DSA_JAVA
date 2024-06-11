import java.util.Scanner;;

public class oddindex {
    public static void main(String[] args) {
        int sum = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print(" - Enter the size of Array : ");
        int size = sc.nextInt();
        int count = 0;
        int[] myarr = new int[size];

        while(size>count){
            System.out.print(" - Add the Element at " + count + " index : ");
            int next = sc.nextInt();
            myarr[count] = next;
            count++;
        }

        for(int i = 0; i<size; i++){
            if(i % 2 != 0){
                sum += myarr[i];
            }
        }
        

        System.out.println("- Total Sum of ODD number is " + sum);
    }
}
