public class hiebrid {
    public static void main(String[] args) {
        Ferrari f = new Ferrari();
        f.color();
        f.tier();
        f.run();


        Kawasaki k = new Kawasaki();
        k.color();
        k.tier();
        k.run();


        boong b = new boong();
        b.color();
        b.tier();
        b.run();
    }
    
}

class Vehical {
    void run(){
        System.out.println("I am a Good Vehical");
        System.out.println();
    }
}

class Car extends Vehical{
    void tier(){
        System.out.println("I have 4 Tier and i can run on roads");
    }
}

class Ferrari extends Car{
    void color(){
        System.out.println("My Color is Red");
    }
}

class Bike extends Vehical{
    void tier(){
        System.out.println("I have 2 Tier and i can run smoothly in Traffic");
    }
}

class Kawasaki extends Bike{
    void color(){
        System.out.println("My Color is Blue");
    }
}

class Ship extends Vehical{
    void tier(){
        System.out.println("I have 0 Tier and i can run smoothly on Water");
    }
}

class boong extends Ship{
    void color(){
        System.out.println("My Color is Dark Green");
    }
}