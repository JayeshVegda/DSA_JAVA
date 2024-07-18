import java.util.Arrays;
import java.util.Collections;

public class inbuilt{

public static void printarr(Integer arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + ", ");
    }
}


public static void main(String [] args){
    Integer arr[] = {5, 6, 1, 2 ,3};
    Arrays.sort(arr, Collections.reverseOrder());
    printarr(arr);
}
}