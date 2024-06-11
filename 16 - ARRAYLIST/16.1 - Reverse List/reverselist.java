import java.util.ArrayList;

public class reverselist {
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(2);
        myarr.add(3);
        myarr.add(5);
        myarr.add(7);
        myarr.add(21);
        myarr.add(23);
        myarr.add(24);

        System.out.println(myarr);


        for(int i = myarr.size() - 1; i>=0; i--){
            System.out.print(myarr.get(i) + " " );
        }
    }
}
