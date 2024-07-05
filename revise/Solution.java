class Solution {
    public static int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        if(digits[n] != 9){
            digits[n] = digits[n] + 1;
        }else{
            digits[n-1] = 1;
            digits[n] = 0;
        }

        return digits;
    }

    public static void prinarr(int[] digits){
        for(int i = 0; i<digits.length; i++){
            System.out.println(digits[i]);
        }
    }
    public static void main(String[] args) {
        int[] de = {9};
        System.out.println(plusOne(de));
        prinarr(de);

    }
}