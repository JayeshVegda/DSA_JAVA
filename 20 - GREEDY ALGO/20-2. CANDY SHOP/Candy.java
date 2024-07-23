import java.util.ArrayList;
import java.util.Arrays;

public class Candy {
    public String shop(int[] candy, int n, int k){
        Arrays.sort(candy);

        int min = 0;
        int buy = 0;
        int free = n - 1;

        while(buy <= free){
            min = min + candy[buy];
            buy++;
            free = free - k;
        }

        int maxi = 0;
        buy = n -1;
        free = 0;

        while (free <= buy) {
            maxi = maxi + candy[buy];
            buy--;
            free = free + k;
        }


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(min);
        arr.add(maxi);
        


        return arr.toString();
    }
    public static void main(String[] args) {
        int candies[] = {3, 2, 1, 4};
        Candy cd = new Candy();
        System.out.println(cd.shop(candies, 4, 2));
    }
}
