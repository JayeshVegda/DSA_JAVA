
public class bubble {
    public static void sort(int listo[]){
        int inner = 0;
        int outer = 0;
        // outer loop 
        for(int turn = 0; turn<listo.length-1; turn++){
            outer = outer + 1;
            for(int j=0; j<listo.length-1-turn; j++){
                inner = inner + 1;
                // inside loop
                //swap it
                if(listo[j] > listo[j+1])
                {
                    int temp = listo[j];
                    listo[j] = listo[j+1];
                    listo[j+1] = temp;
                }
            }

        }

        System.out.println(inner);
        System.out.println(outer);
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
