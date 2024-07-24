import java.util.Arrays;
import java.util.Comparator;

import javax.xml.validation.Validator;

public class frank {
    public static void main(String[] args) {
            int value[] = {60, 100, 120};
            int weigth[] = {10,20,30};
            int w = 50;

            double ratio[][] = new double[value.length][2];
        //0th index -> Index | 1st ->  Ratio 

        //Setting up the 2d arrat | Feeling the array
        for(int i =0; i<ratio.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weigth[i];
        }

        //asecing order sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int cap = w;
        int max = 0;

        for(int i = ratio.length - 1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(cap >=  weigth[idx]){
                max = max + value[idx];
                cap = cap - weigth[idx];
            }else{  
                max += (ratio[i][1] * cap);
                cap = 0;
                break;
            }
        }
        

        System.out.println("Maximun Value is " + max);


    }
}
