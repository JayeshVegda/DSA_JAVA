import java.util.ArrayList;

public class ContaintOptimized{
    public static int water(ArrayList<Integer> hight){
        int max = 0;
        int left_pointer = 0;
        int right_pointer = hight.size() - 1;
        
        while (left_pointer < right_pointer) 
        {
            int high = Math.min(hight.get(left_pointer), hight.get(right_pointer));
            int wid = right_pointer - left_pointer;
            int area = high * wid;

            max = Math.max(max, area);

            if(hight.get(left_pointer) < hight.get(right_pointer) ){
                left_pointer++;
            }else{
                right_pointer--;
            }
        }
        
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(1);
        myarr.add(8);
        myarr.add(6);
        myarr.add(2);
        myarr.add(5);
        myarr.add(4);
        myarr.add(8);
        myarr.add(3);
        myarr.add(7);

        System.out.println(water(myarr));
    }
}