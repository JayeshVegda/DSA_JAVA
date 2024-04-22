public class count
{ 
        public static void sort(int arr[]){
            int n = arr.length;
            int largest = Integer.MIN_VALUE;
            for(int i = 0; i<n; i++){
                largest = Math.max(largest, arr[i]);
            }

            int count[] = new int[largest+1];
            for(int i = 0; i<n; i++){
                count[arr[i]]++;
            }

            int j = 0;
            for(int i = 0; i<count.length; i++){
                while(count[i]>0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
        }
        public static void printarr(int arr[]){
            for(int i = 0; i<arr.length; i++){
                System.out.print(arr[i] + ", ");
            }
        }
        
    
        public static void main(String [] args)
        {
            int listo[] = {2,3,1,6,7, 2, 3, 1, 4,2, 1,2,3,2,1,3,3};
            sort(listo);
            printarr(listo);
        }
    
}
