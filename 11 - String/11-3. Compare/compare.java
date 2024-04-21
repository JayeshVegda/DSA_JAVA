public class compare{
    public static void main(String [] args){
        String str = "I am Jay";
        String str2 = "I am Jay";
        String str3 = new String("I am Jay");
        String str4 = new String("I am Jayesh");

        if(str == str2){
            System.out.println("str and Str2 is Same");
        }
        if(str == str3){
            System.out.println("Str and Str3 is Same");
        }else if(str != str3 ){
            System.out.println("Str and Str3 is not Same");
        }else{
            System.out.println("error");
        }

        Boolean why = str.equals(str3);
        Boolean why2 = str.equals(str4);
        System.out.println(why);
        System.out.println(why2);
        //compare 
    }
}