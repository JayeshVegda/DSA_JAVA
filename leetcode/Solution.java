class Solution {
    public static int percentageLetter(String[] s) {
        int counter = 0;
        for(String x : s){
            int o = x.charAt(11) - 48;
            int t = x.charAt(12) - 48;
            int age = o *10 + t;
            System.out.println(age);
            if(age > 60){
                counter++;
            }

        }

        return counter;
        
    }

    public static void main(String[] args) {
        String[] s = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(percentageLetter(s));
    }
}