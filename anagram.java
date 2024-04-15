public class anagram {
    
    public static boolean win(String str1, String str2){
        int one_end = str1.length();
        int two_end = str2.length();

        if(one_end != two_end){
            return false;
        }

        int arr[] = new int[26];

        for(int i = 0; i<one_end; i++){
            arr[str1.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i<two_end; i++){
            int temp = arr[str2.charAt(i) - 'a']--;
            if(temp == -1){
                return false;
            }


        }

        return true;
    }
    public static void main(String[] args){
        String s = "naa";
        String t = "ana";
        System.out.println(win(s, t));

    }
}
