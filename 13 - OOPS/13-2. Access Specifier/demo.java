public class demo {
    public static void main(String[] args) {
        Car obj = new Car();

        // Accessing and setting values using different access modifiers
        obj.name = "Demo Object";  // 'name' is public, accessible from anywhere
        obj.type = "Demo Type";  // 'type' is protected, accessible within the same package or subclasses
        obj.age = 25;  // 'age' is public, accessible from anywhere
        obj.setPrice(100);  // 'price' is private, accessible only within the same class

        // Accessing and printing values
        System.out.println("Name: " + obj.name);
        System.out.println("Type: " + obj.type);
        System.out.println("Age: " + obj.age);
        System.out.println("Price: " + obj.getPrice());
    }
}

class Car{ 
    public String name;
    protected String type;
    public int age;
    private int price;

    // Getter and setter for the private price field

    // Getter method for 'price', accessible from anywhere
    public int getPrice() {
        return price;
    }

    // Setter method for 'price', accessible from anywhere
    public void setPrice(int price) {
        this.price = price;
    }
}
