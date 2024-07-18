public class quicksort {

    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(i + " ");
        }
    }

    public static void sort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int p_index = pivot(arr, start, end);
        sort(arr, start, p_index-1);
        sort(arr, p_index+1, end);
    }

    public static int pivot(int[] arr, int start, int end){
        
        int index = arr[end];
        int i = start - 1;
        
        for(int j = start; j<end; j++){
            if(arr[j] <= index){
                i++;
                //swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }

        i++;
                //swap 
        int temp = index;
        arr[end] = arr[i];
        arr[i] = temp;
        
        
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,4,1,3,2,3,3,3,32,2,32,2,2,3,3,3,23,23,32,32,23,23,2,3,32,23,2,3,32,32,32,2,3,5};
        sort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
