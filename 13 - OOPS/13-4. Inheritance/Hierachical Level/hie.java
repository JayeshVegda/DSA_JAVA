public class hie {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        Ship s = new Ship();

        c.tier();
        c.run();

        
        b.tier();
        b.run();

        s.tier();
        s.run();

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

class Bike extends Vehical{
    void tier(){
        System.out.println("I have 2 Tier and i can run smoothly in Traffic");
    }
}

class Ship extends Vehical{
    void tier(){
        System.out.println("I have 0 Tier and i can run smoothly on Water");
    }
}