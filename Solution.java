class Solution {
    public static boolean check(int[] arr) {
        int smallest = arr[0];
        int smallest_index = 0;
        int n = arr.length;
        boolean first_part = false;
        boolean second_part = false;

        // get smallest element and its index
        for(int i = 0; i<n; i++)
        {
            if(smallest >= arr[i] )
            {
            smallest = arr[i];
            smallest_index = i;
            }
        }

        // check if its routed and sorted 

        // first part
        for(int i = smallest_index; i<n-1; i++ ){
            if(arr[i] <= arr[i+1]){
                first_part = true;
            }else{
                return false;
            }
        }

        if((smallest_index - ) > 0){
            System.out.println("exe");
        //second part
        for(int i = 0; i<smallest_index -2 ; i++){
            if(arr[i] <= arr[i+1]){
                second_part = true;
            }else{
                return false;
            }
        }}else{second_part = true;}

        System.out.println(first_part);
        System.out.println(second_part);

        if(first_part == true && second_part == true){
            return true;
        }
        return false;
    }

    public static void main(String [] args){
        int[] ags = {1,1,1};
        System.out.println(check(ags));
    }
}