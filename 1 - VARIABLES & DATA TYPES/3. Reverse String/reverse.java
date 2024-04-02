import java.util.*;

public class reverse {
    static void reverse(String s){
        char[] ch = new char[s.length()];
        for(int i = 0; i <s.length(); i++){
            ch[i] = s.charAt(i);
        }
       
        System.out.print("Your Reverse String is : ");
        for(int c = s.length()-1; c >= 0 ; c--){
            System.out.print(ch[c]);
        }
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String myStr = sc.nextLine();
        reverse(myStr);
    }
    
}
