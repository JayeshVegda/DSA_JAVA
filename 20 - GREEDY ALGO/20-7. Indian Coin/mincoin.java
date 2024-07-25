import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class mincoin {
    public static void main(String[] args) {
        Integer coins[] = {1,2,5,10,20,50,100,500,2000};


        Arrays.sort(coins, Comparator.reverseOrder());


        int coin = 0;
        int ammount = 512;
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<coins.length; i++){
            if(coins[i] <= ammount){
                while(coins[i] <= ammount){
                    coin++;
                    ammount = ammount - coins[i];
                    arr.add(coins[i]);
                }
            }
        }

        System.out.println(coin);
        System.out.println(arr);
    }   
}
