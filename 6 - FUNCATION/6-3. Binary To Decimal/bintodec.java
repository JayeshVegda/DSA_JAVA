public class bintodec {
    public static void todec(int num){
        int mynum = num;
        int mypow = 0;
        double mydec = 0;

        while (num>0){
            int ld = num%10; // get a last digiti
            mydec = mydec + (ld * Math.pow(2, mypow));
            mypow = mypow + 1;
            num = num / 10;
        }

        System.out.println("Binray Number : " + mynum);
        System.out.println("Decimal Number : " + (int)(mydec));

    }
    public static void main(String [] args){
        todec(1010);
    }
}
