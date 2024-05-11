import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-1; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,5,5};
        System.out.println(containsDuplicate(arr));
    }
}