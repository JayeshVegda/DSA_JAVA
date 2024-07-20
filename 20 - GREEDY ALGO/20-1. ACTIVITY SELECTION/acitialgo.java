import java.util.ArrayList;

public class acitialgo {
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2,4, 6, 7, 9, 9};
        
        //end time base
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        //1st Activity
        max=1;
        arr.add(0);
        int lastact = end[0];


        for(int i = 1; i<end.length; i++){
            if(start[i] >= lastact)
                {
                max++;
                arr.add(i);
                lastact = end[i];
            }
        }

        System.out.println("Max Activtiy = " + max);
        for(int i = 0; i<arr.size(); i++){
            System.out.print("A"+arr.get(i)+", ");
        }
    }
}
