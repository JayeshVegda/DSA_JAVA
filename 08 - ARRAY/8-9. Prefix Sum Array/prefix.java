public class prefix{

    public static void prefixray(int[] numbers){
        int current = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefixo[] = new int[numbers.length];

        prefixo[0] = numbers[0];
        for(int i = 1; i<prefixo.length; i++){
            prefixo[i] = prefixo[i-1] + numbers[i];
        }

        for(int i = 0; i<numbers.length; i++){
            for(int j = i; j<numbers.length; j++)
            {
                current = i == 0 ? prefixo[j] : prefixo[j] - prefixo[i-1];
                if(maxsum < current){
                    maxsum = current;
                }


            }
        }
        System.out.println("Max Sum : "  + maxsum);

    }
    public static void main(String [] args){
        int num[] = {3,5,6,7,2};
        prefixray(num);
    }

}