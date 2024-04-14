public class binary{
    public static int search(int key, int num[]){
        int start = 0;
        int end = num.length - 1;
        int itration = 1;
        while(start<=end){ 
            int mid = (start + end) / 2;
            //System.out.println("Itreation : " +  itration);
            //itration = itration +1;
            //System.out.println("First Start  : "+start);
            //System.out.println("First End  : "+end);
            //System.out.println("First mid : "+mid);
            //System.out.println();
            if(num[mid] == key){
                return mid;
            }
            else if (num[mid] < key){
                start = mid+1;
            }else{
                end = end-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int mynum[] = {1,2,3,4,5,6,7,8,9};
        int key = 9;
        int resutl = search(key, mynum);
        System.out.println(resutl);
    }
}