public class survive {

    public static int island(int s, int n, int m){
        // N – The maximum unit of food you can buy each day.
        // S – Number of days you are required to survive.
        // M – Unit of food required each day to survive.
        // you cant buy food on SUNDAY

        int sunday = s/7; // 10//7 = 1
        int buying_day = s - sunday; // 10 - 1 = 9
        int totalFood= s*m; // 10 * 2 == 20
        int ans =0; // 0 | 

        if (totalFood % n == 0) { // 20 % 16 == 0 is false, bc 20%16 = 4
            ans = totalFood / n; // no execute
        } else {
            ans = totalFood / n + 1; // 20 / 16 + 1 = 1+1 = 5
        }

        if (ans <= buying_day) { 
            return ans;
        } else {
            return -1;
        }

    }
    public static void main(String[] args) {
        System.out.println(island(10, 16, 2));
    }
}
