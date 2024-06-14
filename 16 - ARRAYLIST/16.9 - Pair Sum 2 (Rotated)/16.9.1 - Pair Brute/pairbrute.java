import java.util.*;

public class pairbrute {
    public static boolean pairsum(ArrayList<Integer> myarr, int tar){
        int n = myarr.size();

        for(int i = 0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                if(myarr.get(i) + myarr.get(j) == tar){
                    return true;
                }
            }
        }
        
        return false;
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


        System.out.println(pairsum(myarr, 19));
    }
}
