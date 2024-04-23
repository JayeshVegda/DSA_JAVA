public class abs {
    public static void main(String[] args) {
        
        Ferrari f = new Ferrari();
        f.tier();
        f.color();

        Bmw b = new Bmw();
        b.color();
        b.tier();
    }
}

abstract class Car{
    void tier(){
        System.out.println("My Car have 4 Tier");
    }

    abstract void color();
}

class Ferrari extends Car{
    void color(){
        System.out.println("Red is Mine Signature Colour");
    }
}

class Bmw extends Car{
    void color(){
        System.out.println("Blue is mine Signature colour");
    }
}
