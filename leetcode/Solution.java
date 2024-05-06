import java.util.Arrays;

class Solution {
    public static String sortSentence(String s) {
        String arr[] = s.split(" ");
        String myarr[] = new String[s.length()];
        StringBuilder str = new StringBuilder();
        int n = arr.length;

        for(int i = 0; i<n; i++){
            int last = arr[i].length() - 1;
            int digit = arr[i].charAt(last) - 49;
            System.out.println(digit);
            myarr[digit] = arr[i];
        }

        for(int i = 0; i<n; i++){
            str.append(myarr[i]);
        }
        return str.toString().replaceAll("[0-9]", " ").trim();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }
}