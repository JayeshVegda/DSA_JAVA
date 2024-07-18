public class sortandrout {
    public static int sort(int arr[], int target , int start, int end)
    {
        // base case
        if( start > end){
            return -1;
        }
        // create mid
        int mid = start + (end - start) / 2;

        // case found
        if(arr[mid] == target){
            return mid;
        }

        //L1
        if(arr[start] <= arr[mid]){
            //case 1:   
            if(arr[start] <= target  && target <= arr[mid]){
                return sort(arr, target, start, mid-1);
            }
            //case 2:
            else{
                return sort(arr, target, mid+1, end);
            }
        }


        // L2
        else{
             //case 3:
            if(arr[mid] <= target && target <= arr[end]){
               return sort(arr, target, mid+1, end);
            }

            // case 4:
            else{
                return sort(arr, target, start, mid-1);
            }
        }
        
    }

    public static void main(String[] args) {
        
        int arr[] = {6,7,8,9,0,1,2,3,4,5};
        int tar =  6;
        int result = sort(arr, tar, 0, arr.length -1 );
        System.out.println(result);
    }
}
