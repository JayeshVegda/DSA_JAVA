public class dup {
    public static void removeduplicate(String s, int index, StringBuilder str, boolean map[]){
        
        // Base Case
        if(index == s.length()){
            System.out.println(str);
            return;
        }


        // Work
        char cc = s.charAt(index);
        if(map[cc - 'a'] == true){
            removeduplicate(s, index+1, str, map);
        }else{
            map[cc - 'a'] = true;
            removeduplicate(s, index+1, str.append(cc), map);
        }

    }


    public static void main(String [] args){
        String s = "jayeshvegda";
        removeduplicate(s, 0, new StringBuilder(""), new boolean[26]);

    }
}
