import java.util.LinkedList;
import java.util.Queue;

public class firstrep {
    public static int nonreapeter(String sc){
        // int n = sc.length();
        // Queue<Character> q = new LinkedList<>();
        // int[] freq = new int[26];
        
        
        // for(int i = 0; i<n; i++){
        //     char ch = sc.charAt(i);
        //     freq[ch-'a']++;
        //     q.add(ch);


        //     while (!q.isEmpty() && freq[ch-'a'] > 1) {
        //         q.remove();
        //     }

        //     if(!q.isEmpty()){
        //         return freq[ch-'a'] - 1;
        //     }
        // }


        // return -1;


        int n = sc.length();
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        int finala = -1;
        
        for(int i = 0; i<n; i++){
            char ch = sc.charAt(i);
            freq[ch-'a']++;
            q.add(ch);


            while (!q.isEmpty() && freq[ch-'a'] > 1) {
                q.remove();
            }

            if(!q.isEmpty()){
                finala = freq[ch-'a'] - 1;
            }
        }

        
        return finala;

    }
    public static void main(String[] args) {
        String sc = "loveleetcode";
        System.out.println(nonreapeter(sc));
    }
}
