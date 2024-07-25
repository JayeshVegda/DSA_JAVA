import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Mymain {
    public static void main(String[] args) {
        int paris[][] =  {
            {5,24} , {39,60} , {5,28}, {27,40},{50,90}
        };


        Arrays.sort(paris, Comparator.comparingDouble(o -> o[1]));

        int chainlen = 1;
        int chainend = paris[0][1];


        for(int i = 1; i<paris.length; i++){
            if (paris[i][0] > chainend) {
                chainlen++;
                chainend = paris[i][1];
            }
        }


        System.out.println(chainlen);
    }
}
