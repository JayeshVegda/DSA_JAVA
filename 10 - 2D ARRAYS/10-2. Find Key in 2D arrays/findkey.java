import java.util.Scanner;
public class findkey {
    public static void find(int arr[][], int key){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.print(arr[i][j]);
                    System.out.println(
                        "We have found your key " + key + " at Index (" + i + ", " + j + ")." 
                    );
                }
            }
            System.out.println("Not found");
        }
    }

    public static void printarr(int arr[][]){
        for(int i =0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
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
        find(arr, 5);
    }
}
