import java.lang.reflect.Array;
import java.util.ArrayList;

public class MultiDimanion {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainarr = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(60);
        list2.add(50);

        list3.add(100);
        list3.add(200);
        list3.add(300);

        // add list into arry
        mainarr.add(list1);
        mainarr.add(list2);
        mainarr.add(list3);

        // print
        for(int i = 0; i<mainarr.size(); i++){
            ArrayList<Integer> curr = mainarr.get(i);
            for(int j = 0; j<curr.size(); j++){
                System.out.print(curr.get(j) + " ");
            }

            System.out.println();
        }

    }


}
