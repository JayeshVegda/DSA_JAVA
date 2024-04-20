public class short2 {
    public static float check(String s) {
        int x = 0;
        int y = 0;
        int n = s.length();
        for(int i = 0; i<n; i++){
            char dir = s.charAt(i);
            if(dir == 'W'){
                x--;
            }
            else if(dir == 'E')
            {
                x++;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }else{
                return 0;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String [] args){
        String s = "WNEENESENNN";
        System.out.println(check(s));

        // w=-- s= -- E=++ N=++
    }
}
