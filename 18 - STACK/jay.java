public class jay {
    String name = "as";
    private jay(){
        this.name = "dds";
    }

    public void msg(){
        System.out.println("Hello "  + name);
    }

    public static void main(String[] args) {
        jay j = new jay();
        j.msg();
    }
}
