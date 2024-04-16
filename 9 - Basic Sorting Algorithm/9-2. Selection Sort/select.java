
public class select {
    public static void sort(int listo[]){
        int n = listo.length;
        for(int i = 0; i<n-1; i++){
            int minpos = i;

            for(int j = i+1; j<n; j++){
                if(listo[minpos] > listo[j])
                {
                    minpos = j;
                }
            }

            int temp = listo[minpos];
            listo[minpos]  = listo[i];
            listo[i] = temp;
        }
    }   

    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
    
    public static void main(String []args){
        int listo[] = {2,3,1,6,7};
        sort(listo);
        printarr(listo);
        
       
    }
}
