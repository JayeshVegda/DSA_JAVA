
public class bubble {
    public static void sort(int listo[]){
        for(int turn = 0; turn<listo.length-1; turn++){
            for(int j=0; j<listo.length-1-turn; j++){

                //swap it
                if(listo[j] > listo[j+1])
                {
                    int temp = listo[j];
                    listo[j] = listo[j+1];
                    listo[j+1] = temp;
                }
            }
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
