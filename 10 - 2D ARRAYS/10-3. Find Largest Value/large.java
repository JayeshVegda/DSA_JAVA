import java.util.Scanner;

public class large {

    public static int largest(int arr[][]){
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(largest<arr[i][j]){
                    largest = arr[i][j];
                }
            }

        }
        return largest;
    }

    
    public static void main(String [] args){
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        largest(arr);
        System.out.println("Your Largest Element in Array is " + largest(arr));
    }
}
