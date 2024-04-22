public class q4 {
    public static void main(String [] args){
        int a = 100;
        int b = 200;

        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sqrt = (int) Math.sqrt(a);
        int pow = (int) Math.pow(a, b);
       // int avgp = (int) Math.avg(23,25);
        int abs = (int) Math.abs(a);


        System.out.println(" Min of " + a + " & " + b + " is " + min);
        System.out.println(" Max of " + a + " & " + b + " is " + max);
        System.out.println(" Sqaure Root of " +  a + " is " + sqrt);
        System.out.println(" Powe of " +  a + " on " + b + " is " + pow);
       // System.out.println(" Avarage" +  a + " and " + b + " is " + avgp);
        System.out.println(" Absoulte " +  a + " is " + abs);
    }    
}
