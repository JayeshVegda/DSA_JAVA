public class methodoverloding {
    
    public static void main(String[] args) {
        Calc c = new Calc();
        System.out.println(c.sum(2,3));    
        System.out.println(c.sum(2,3,3,3));    
        System.out.println(c.sum((float) 2.42, (float)3.42));    
    }
}

class Calc{
    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c, int d){
        return (a+b+c+d);
    }
}