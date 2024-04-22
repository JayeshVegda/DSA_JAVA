public class insert {
    
    public static void sort(int arr[]){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int c = i;
            int p = i-1;
        
            while(p >= 0 && arr[p+1] > arr[c])
            {
                arr[p+1] = arr[p];
                p--;
            }
            arr[p+1] = arr[c];
        }
    }

    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    

    public static void main(String [] args)
    {
        int listo[] = {2,3,1,6,7};
        sort(listo);
        printarr(listo);
    }

}
