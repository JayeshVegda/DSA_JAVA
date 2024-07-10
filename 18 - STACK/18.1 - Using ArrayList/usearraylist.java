import java.util.ArrayList;

public class usearraylist {
    
    
    static class Stack {

        static ArrayList<Integer> mylist = new ArrayList<>();

        public static boolean isEmpty()
        {
            return mylist.size() == 0;
        }

        //Push
        public static void push(int data)
        {
            mylist.add(data);
        }

        public static int size(){
            return mylist.size();
        }
        // Pop
        public static int pop()
        {
            if(isEmpty()){
                return -1;
            }
            
            int top = mylist.get(mylist.size() - 1);
            mylist.remove(mylist.size() - 1);

            return top;
        }

        // Peek
        public static int peek()
        {
            if(isEmpty()){
                return -1;
            }
            return mylist.get(mylist.size() - 1);
        }
        
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(1);
        s.push(2);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

}
