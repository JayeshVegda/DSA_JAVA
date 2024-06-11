import java.util.*;

public class SwapTwo {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(2);
        myarr.add(3);
        myarr.add(52);
        myarr.add(1);
        myarr.add(21);
        myarr.add(23);
        myarr.add(24);

        int temp = myarr.get(1);
        myarr.set(1, 24);
        myarr.set(myarr.size()-1, temp);


        System.out.println(myarr);
    }
}
