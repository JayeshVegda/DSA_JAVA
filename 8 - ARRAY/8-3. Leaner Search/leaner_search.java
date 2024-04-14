public class leaner_search {
    public static void search(int arryn[], int n){
        for(int i = 0; i<=arryn.length; i++){
            if(arryn[i] == n){
                System.out.println("Element found at : " + i);
            }

        }
    }

    public static void main(String [] args){
        int element = 5;
        int number[] = {1,2,3,1,2,3,4,5,6,6,6,7,8,5};

        search(number, element);
    }
}
