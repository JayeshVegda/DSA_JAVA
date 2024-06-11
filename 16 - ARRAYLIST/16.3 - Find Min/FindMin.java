import java.util.*;
public class FindMin {

    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(2);
        myarr.add(3);
        myarr.add(52);
        myarr.add(1);
        myarr.add(21);
        myarr.add(23);
        myarr.add(24);
        int max = Integer.MAX_VALUE;

        for(int i = 0; i<myarr.size(); i++){
            if(max > myarr.get(i)){
                max = myarr.get(i);
            }
        }


        System.out.println(max);
    }
}