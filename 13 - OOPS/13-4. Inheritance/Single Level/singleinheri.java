public class singleinheri {
    public static void main(String[] args) {
        Car car = new Car();
        car.Name = "Porshe";
        car.ferrari();
        car.porshe();
        car.love();
    }
}

// Base - Parents Classs / SuperClass
class Vehical{
    String Name;

    void ferrari(){
        System.out.println("I love Ferrari");
    }

    void porshe(){
        System.out.println("Porsche is Great Car");
    }
}


// Derived - Child CLass / Subclass
class Car extends Vehical{
    void love(){
        System.out.println("I love Cars Specially......");
    }
}
