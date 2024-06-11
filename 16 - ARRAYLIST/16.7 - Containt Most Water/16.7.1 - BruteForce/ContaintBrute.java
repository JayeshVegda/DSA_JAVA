import java.util.*;


public class ContaintBrute {

    public static int water(ArrayList<Integer> hight){
        int max = 0;
        for(int i = 0; i<hight.size(); i++){
            for(int j = i+1; j<hight.size(); j++){
                int high = Math.min(hight.get(i), hight.get(j));
                int wid = j - i;
                int area = high * wid;

                //update 
                max = Math.max(max, area);
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
