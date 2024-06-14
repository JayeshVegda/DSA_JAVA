import java.util.ArrayList;

public class pairopti {
    public static boolean pair(ArrayList<Integer> myarr, int tar){
        int n = myarr.size();
        int lp = 0;
        int rp = n - 1;

        while (lp != rp) {
            int total = myarr.get(lp) + myarr.get(rp);

            if(total == tar){
                return true;
            }else if(total > tar){
                lp++;
            }else{
                rp--;
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


        System.out.println(pair(myarr, 9));
    }
}
