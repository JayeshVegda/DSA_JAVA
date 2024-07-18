public class mergesort {

    public static void sort(int arr [], int start, int end)
    {   
        if(start >= end){
            return;
        }
        int mid = (start + (end - start) / 2);
        sort(arr, start, mid);
        sort(arr, mid+1, end);
        merge(arr, start, mid, end);

    }

    public static void merge(int arr[], int start, int mid, int end)
    {
        int tempo[] = new int[end-start + 1];
        int n = tempo.length;
        int l = start; // iterator for left
        int r = mid+1; // iterator for right
        int point = 0; // iterator for tempo

        while(l <= mid && r <= end)
        {
            if(arr[l] < arr[r]){
                tempo[point] = arr[l];
                l++;
            }else{
                tempo[point] = arr[r];
                r++;
            }
            point++;
        }


        //left part
        while(l <= mid)
        {
            tempo[point++] = arr[l++];
        }

        // right part
        while(r <= end){
            tempo[point++] = arr[r++];
        }
        

        //copy temp
        for(point = 0, l =start; point<n; point++, l++){
            arr[l] = tempo[point];
        }

    }

    static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] myarr = {6,2,4,3,5,1};
        sort(myarr, 0, myarr.length-1); 
        printarr(myarr);
    }
}
