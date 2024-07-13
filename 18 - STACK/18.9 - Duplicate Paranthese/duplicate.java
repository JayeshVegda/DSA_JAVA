import java.util.Stack;

public class duplicate {
    public static boolean isDuplicate(String str){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')')
            {
                int counter = 0;

                while (stk.peek() != '(') {
                    
                    stk.pop();
                    counter++;
                }

                if(counter < 1){
                    return false;
                }
                else{
                    stk.pop();
                }
            }
            else{
                stk.push(ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "((a+b)+(b+e))";
        System.out.println(isDuplicate(s));

    }
}
