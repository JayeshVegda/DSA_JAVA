class bubble{

    public static void bubblesort(int myarr[])
    {
        int n = myarr.length;

        // Outer Loop 
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
               
                if(myarr[j] > myarr[j+1])
                {
                // swapp
                int temp = myarr[j];
                myarr[j] = myarr[j+1];
                myarr[j+1] = temp;
                }
                
            }
        }
    }

    public static void selectionsort(int[] myarr){
        int n = myarr.length;

        // 5,4,3,1,2

        for(int i = 0; i<n-1; i++){
            int mini = i; 

            for(int j = i; j<n; j++)
            {
                if(myarr[j] < myarr[mini] ){ // 
                    mini = j;
                }
            }

            //swap
            int temp = myarr[mini]; 
            myarr[mini] = myarr[i];  
            myarr[i] = temp;
        }




    }

    public static void insertsort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int prev = i - 1;

            //finding out postion 
            while(prev >= 0 && arr[prev] > key){
                arr[prev+1] = arr[prev];
                prev--;
            }


            //insertion
            arr[prev+1] = key;
        }
    }
    public static void displayarr(int myarr[])
    {
        insertsort(myarr);
        int n = myarr.length;
        for(int i = 0; i<n; i++)
        {
            System.out.print(myarr[i] + " ");
        }
    }
    
    public static void main(String[] args)
    {   
        int[] myarr = {5,4,3,1,2};
        displayarr(myarr);
    }
}