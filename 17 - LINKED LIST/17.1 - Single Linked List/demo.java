class demos {

    //defind field
    private Node head;
    private Node tail;
    private int size;

    // class's construtor
    public demos(){
        this.head =  null;
        this.tail = null;
        this.size = 0;
    }
    
    // create node
    public static class Node 
    {
        public int value;
        public Node next;
        //create node construro for end one
        public Node(int value)
        {
            this.value = value;
            this.next = null;
        }

        public Node(int value, Node next)
        {
            this.value = value;
            this.next = next;
        }
    }

    public int mysize(){
        return size;
    }

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void addlast(int value){
        if (tail == null) {
            addFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }   

    public void addatindex(int value, int idx){
        if(head == null){
            addFirst(value);
            return;
        }
        if(head == tail){
            addlast(value);
            return;
        }
        if(idx < mysize()){
            Node temp = head;
            for(int i = 1; i<idx; i++){
                System.out.println(temp.value);
                temp = temp.next;
            }
            Node newo = new Node(value, temp.next);
            temp.next = newo;
           
        }else{
            System.out.println("eeeeeror");
        }
        size+=1;
    }

    public void deletefirst(){
        if (head == null) {
            return;
        }
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deletelast(){

        if(mysize() <= 1){
            deletefirst();
            return; 
        }
        Node temp = head;
        for(int i = 1; i<mysize() - 1; i++){
            temp = temp.next;
        }
        temp.next = null;
        size--;
    }

    public void deleteatindex(int idx)
    {
        if (idx < 0 || idx >= size) {
            System.out.println("Error: Index out of bounds");
            return;
        }
        if (idx == 0) {
            deletefirst();
            return;
        }
        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        if (temp.next == null) 
        {
            tail = temp;
        }
        size--;
    }

    public void deletevalue(int value){
        Node temp = head;
        Node temp2 = head;
        int counter = 0;
        // System.out.println("Value that i want to remove " + value);
        while(temp.value != value){
            temp = temp.next;
            counter++;
        }

        for(int i = 1; i<counter;i++){
            temp2 = temp2.next;
        }

        temp2.next = temp.next;
        temp = null;

        size--;
        // System.out.println(" --- this is my temp vale next 1 : " + temp2.value);
        // System.out.println(" --- this is my temp vale next 2 : " + temp.value );
    }

    public int searchbyindex(int idx){
        Node temp = head;
        if(idx < mysize()){
            for(int i = 0; i<idx; i++){
                temp = temp.next;
            }
            return temp.value;
        }

        return -1;
    }
    
    public int searchbyvalue(int val){
        Node temp = head;
        int counter = 0;
        for(int i = 0; i<mysize()-1; i++){
            temp = temp.next;
            counter++;
            if(temp.value == val){
                return counter;
            }
        }

        return -1;
    }
    
    public void replacebyvalue(int real, int replace){
        int idx = searchbyvalue(real);
        
        Node temp = head;
        if(idx != -1)
        {
            for(int i = 0; i<idx; i++){
                temp = temp.next;
            }

            temp.value = replace;
        }
    }
    
    public void replacebyidx(int real, int replace){
        int val = searchbyindex(real);
        int idx = searchbyvalue(val);
        
        Node temp = head;
        if(idx != -1)
        {
            for(int i = 0; i<idx; i++){
                temp = temp.next;
            }

            temp.value = replace;
        }

    }

    public void findodd(){
        int n = mysize();
        int sum = 0 ;
        Node temp = head;
        while (temp != null) {
            sum = sum + temp.value;
            if(temp.next == null){
                break;
            }
            temp = temp.next.next;
        }
        System.out.println(sum);
    }

    public int findmid(){

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public void display()
    {
        // creating temp of head
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
  
    }
}




public class demo {
    public static void main(String[] args) {
        demos ds = new demos();
        ds.addFirst(1);
        ds.addlast(2);
        ds.addlast(3);
        ds.addlast(4);
        ds.addlast(5);
        ds.addlast(6);
        ds.addlast(7);
        ds.addlast(8);
        ds.addlast(9);
        ds.addlast(10);
        ds.addlast(11);
        // ds.addlast(4);
        // ds.addlast(5111);
        // ds.addlast(6);
        // ds.addlast(7);
        // ds.addlast(8);
        // ds.addlast(9);
        // ds.addlast(10);
        // ds.addlast(100);
        // ds.addlast(1000);
        // ds.deletevalue(10);
        ds.display();
        // ds.searchbyindex(4);
        //System.out.println(ds.searchbyvalue(1000));
        // ds.replacebyvalue(43, 11);
        // ds.replacebyidx(31, 2);
        ds.display();
        System.out.println(ds.findmid());
        
        // for(int i = 0; i<n; i++)
        // {
        //     if(i%2 == 0){

        //         int my = ds.searchbyindex(i);
        //         total = total + my;
        //     }
        // }
        ds.findodd();
        // System.out.println("Total Sum of Odd Number : " + total);
        
        // System.out.println(ds.mysize());

    }
    
}