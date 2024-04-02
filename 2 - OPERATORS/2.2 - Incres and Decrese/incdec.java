public class incdec {
    public static void main(String[] args){
        int pre = 10; // define 10 in memory
        int see_pre = ++pre; //  first chagne value of pre and save same as pre
        System.out.println("Real Value : " + pre); 
        System.out.println("Pre Incresment : " + see_pre); 

        System.out.println();
        System.out.println();

        int post = 10; // define 10 in memory
        int see_post = post++; // first set value of post in see_post and then change value of post 
        System.out.println("Real Value : " + post);
        System.out.println("Post Incresment : " + see_post);
    }
}
