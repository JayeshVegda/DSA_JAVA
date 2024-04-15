//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

public class q1 {
    public static boolean valuetwice(int num[]){
        int n = num.length;
        boolean value1 = false;

        for(int i = 0; i<n; i++)
        {
           for(int j = i+1; j<n; j++){
            if(num[i] == num[j]){
                value1 = true;
            }
           }
        }

        return value1;
    }

    public static void main(String[] args){

        int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(valuetwice(num));

    }
}
