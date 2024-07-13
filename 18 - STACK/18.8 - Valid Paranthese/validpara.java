import java.util.Stack;

public class validpara {
    public static boolean isvalidpara(String para){
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i<para.length(); i++)
        { 
            char mychar = para.charAt(i);

            //opening
            if(mychar == '(' || mychar == '{' || mychar == '[')
            {
                stk.push(mychar);
            }
            else{
                if(stk.isEmpty()){
                    return false;
                }
                if((stk.peek() == '(' && mychar == ')') || (stk.peek() == '{' && mychar == '}') || (stk.peek() == '[' && mychar == ']'))
                {
                    stk.pop();
                }else{
                    return false;
                }
            }
            
        }
        
        if(stk.isEmpty())
        {
            return true;
        }else{
        return false;
        }
    }
    public static void main(String[] args) {
        String str = "({[])}";
        System.out.println(isvalidpara(str));
    }
}
