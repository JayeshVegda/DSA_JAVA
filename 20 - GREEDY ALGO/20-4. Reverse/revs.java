public class revs {
    public static String reverse(String sc){
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        StringBuffer tempo = new StringBuffer();
        int n = sc.length();


        for(int i = n-1; i>=0; i--){
           if(sc.charAt(i) == '-'){
                temp.reverse();
                sb.append(temp + " ");
                int len = temp.length();
                temp.delete(0, len);
           }
           else{
                temp.append(sc.charAt(i));
           }


        }

                temp.reverse();
                sb.append(temp);
                int len = temp.length();
                temp.delete(0, len);
    
        return sb.toString();
    }

    public static void main(String[] args) {
        String sc = "i-like-you-very-much";
        System.out.println(reverse(sc));
    }
}
