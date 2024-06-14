import java.util.ArrayList;

public class pair {

    public static boolean sum(ArrayList<Integer> myarr, int tar){
        int n = myarr.size();
        int breaking_point = -1;

        // finding breaking point
        for(int i = 0; i<n; i++){
            if(myarr.get(i) > myarr.get(i+1)){
              breaking_point = i;
              break;
            }
        }

        // init left and right pointer
        int lp = breaking_point+1;
        int rp = breaking_point;

        while(lp != rp){
            int total  = myarr.get(lp) + myarr.get(rp);

            // case 1
            if(total == tar){
                return true;
            }

            // case 2 
            else if(total < tar){
                lp = (lp + 1) % n;
            }
            
            //case 3
            else{
                rp = (n+rp-1) % n;  
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myarr = new ArrayList<>();
        myarr.add(11);
        myarr.add(12);
        myarr.add(13);
        myarr.add(14);
        myarr.add(5);
        myarr.add(6);
        myarr.add(7);
        myarr.add(9);
        myarr.add(10);


        System.out.println(sum(myarr, 24));
    }
}
