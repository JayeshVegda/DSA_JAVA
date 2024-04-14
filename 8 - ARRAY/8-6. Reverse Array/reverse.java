public class reverse {
    
    public static void doReverse(int num[]){
        int start = 0;
        int end = num.length -1;
        while(start < end){
            int temp = num[end];
            num[end] = num[start];
            num[start]  = temp;

            start++;
            end--;
        } 
    }
    public static void main(String [] args){
        int num[] = {1,3,4,5,7,8,9};
        doReverse(num);
        for(int i = 0; i<num.length; i++){
            System.out.print(num[i]);
        }
    }
}
