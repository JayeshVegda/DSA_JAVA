public class buystoke {
    public static int stoke(int price[]){
        int lowest_bp = Integer.MAX_VALUE;
        int max = 0;
        int n = price.length;
        int last = price.length-1;


        //itreate through all
        for(int i = 0; i<n; i++){
            if(price[i]>lowest_bp){
                int todaymax = price[i] - lowest_bp;
                max = Math.max(max, todaymax);

            }else{
                lowest_bp = price[i];
            }


           
        }

        return max;
       
    }
    public static void main(String [] args){
        int price[] = {7,1,5,3,6,4};
        System.out.println("Higest Profit ever would be " + stoke(price));
    }
}
