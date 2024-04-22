public class myconst {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Porshe");
        Car c3 = new Car("Porshe", 29999);

    }
}

class Car{
    String name;
    int price;



    Car(){
        System.out.println("You have not Provided any details");
    }

    Car(String name){
        System.out.println(name + " is a really good car");
    }
    Car(String name, int price){
        System.out.println(name + "'s Price is " + price);
    }

}