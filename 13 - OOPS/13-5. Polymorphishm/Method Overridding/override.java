public class override {
    public static void main(String[] args) {
        Car c = new Car();
        Porsche p = new Porsche(); 
        p.price();
        c.price();

    }   
    
}

class Car{
    void price(){
        System.out.println("I am a Car");
    }
}

/**
 * porsche
 */
class Porsche {
    void price(){
        System.out.println("I am a Porsche");
    }
    
}
