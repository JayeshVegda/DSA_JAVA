public class arr {

    public static void main(String[] args) {
        int[] n = {1,2,2,6,3,4,5,6};
        System.out.println(array(n, 0));
    }

    public static boolean array(int arr[], int i){
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        
        return array(arr,i +1);
    }
}
