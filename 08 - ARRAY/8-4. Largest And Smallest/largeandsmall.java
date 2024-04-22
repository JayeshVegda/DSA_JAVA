public class largeandsmall {
    public static void getLarge(int num[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<=num.length; i++){
            if(largest<i){
                largest = num[i];
            }
        }

        System.out.println("Largest Number is : " + largest);
    }

    public static void getSmall(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i<=num.length; i++){
            if(smallest>i){
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number is :" + smallest);
    }

    public static void main(String [] args){
        int num[] = {2,2,4,5,6,1,2,4,53,1,5,5,6,7,2};
        getLarge(num);
        getSmall(num);
    }
}
