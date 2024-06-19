import java.io.*;
import java.util.* ;

public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int one = arr1.length;
        int two = arr2.length;
        int[] res = new int[one+two];

        int pointer_left = 0;
        int pointer_right = 0;
        int counter = 0;

        while (pointer_left < pointer_right) {
            if(arr1[pointer_left] < arr2[pointer_right]){
                res[counter] = arr1[pointer_left];
                pointer_left++;
                
            }

            if(arr1[pointer_left] == arr2[pointer_right]){
                res[counter] = arr1[pointer_left];
                pointer_left++;
            }

            if(arr1[pointer_left] > arr2[pointer_right]){
                res[counter] = arr2[pointer_right];
                pointer_right++;
            }

            counter++;
        }

      
        return res;
    }



    public static void main(String[] args) {
       
    }
}