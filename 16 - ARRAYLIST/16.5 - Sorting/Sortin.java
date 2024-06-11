import java.util.*;
public class Sortin {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(2);
        myarr.add(3);
        myarr.add(52);
        myarr.add(1);
        myarr.add(21);
        myarr.add(23);
        myarr.add(24);

        Collections.sort(myarr);
        System.out.println(myarr);
    }
}
