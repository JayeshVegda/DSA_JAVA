class Solution {
    public static char slowestKey(int[] releaseTimes, String keysPressed) {
        int slowestKeyindex = releaseTimes[0];
        int index = Integer.MAX_VALUE;
        int n = releaseTimes.length;

        for(int i = 0; i<n-1; i++){

            System.out.println("Current Slowest Key is " + slowestKeyindex);
            System.out.println("ith Value : " + keysPressed.charAt(i));
            System.out.println("i+1 Value : "+  keysPressed.charAt(i + 1));
            System.out.println("time of ith : "+  releaseTimes[i]);
            System.out.println("time of i+1th : "+  releaseTimes[i+1]);
            System.out.println("Diff : "+  (releaseTimes[i+1] - releaseTimes[i]));
            System.out.println();

            int temp = (releaseTimes[i+1] - releaseTimes[i]);
            if((slowestKeyindex<= temp )){
                slowestKeyindex = releaseTimes[i+1]-releaseTimes[i];
                index = i;
            }
        }
        return keysPressed.charAt(index);
    }

    public static void main(String[] args) {
        int releaseTimes[] = {9,29,49,50};
        String str = "cbcd";

        System.out.println(slowestKey(releaseTimes, str));

    }
}