class Solution {
  public static int maxArea(int[] height) {
      // int n = height.length;
      // int max = 0;
      // for(int i = 0; i<n; i++){
      //   for(int j = i + 1; j<n; j++){
      //     int high = Math.min(height[i], height[j]);
      //     int wid = j - i;
      //     int area = high * wid;

      //     max = Math.max(max, area);
      //   }
      // }

      


      int n = height.length;
      int left_pointer = 0;
      int right_pointer = n - 1;
      int max = 0;
      while (left_pointer < right_pointer) {
        int high = Math.min(height[left_pointer], height[right_pointer]);
        int wid = left_pointer - right_pointer;
        int area = high * wid;
        max = Math.max(max, area);

        if(height[left_pointer] < height[right_pointer] ){
          left_pointer++;
        }else{
          right_pointer--;
        }
      }


      return max;
  }
}