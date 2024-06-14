public class sol {
    public static void main(String[] args) {
        String sc = "death*is*like//a*wind";
        StringBuilder ss = new StringBuilder();
        int n  = sc.length();
        for(int i = 0; i<n-1; i++)
        {
            char c = sc.charAt(i);
            char c_next = sc.charAt(i + 1);
            if(c == '*'){
                ss.append(" ");
            }else if(c == '/'){
                if(c_next == '/' | c_next == '*'){
                    ss.append(" ");
                }else{
                    char add = Character.toUpperCase(c_next);
                    ss.append(add);
                } 
            } 
            else{
                ss.append(c);
            }
        }
    
        System.out.println(ss.toString());
    }
}
