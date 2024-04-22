public class tapwater {

    public static int water(int hight[]){
        int n = hight.length;
        int last = n -1;
        int tapwater = 0;
        // LEFT MAX
        int leftMax[] = new int[n];
        leftMax[0] = hight[0];
        for(int i =1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], hight[i]);
        }
        

        // RIGHT MAX    
        int rightMax[] = new int[n];
        rightMax[last] = hight[last];
        for(int i =last-1; i>=0; i--){
            rightMax[i] = Math.max(hight[i], rightMax[i+1]);
        }

        // GET WATERLEVEL 
        for(int i = 0; i<n; i++){
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            tapwater += waterlevel - hight[i];
        }

        return tapwater;

    }

    public static void main(String [] args){
        int hight[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(water(hight));
    }
    
}
