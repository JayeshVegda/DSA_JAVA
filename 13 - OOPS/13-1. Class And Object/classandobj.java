public class classandobj {
    public static void main(String[] args) {
        Car car = new Car();
        car.setname("Porshe");
        car.setModelname(3);
        car.setSale(true);
        car.displaydata();
    }
}

class Car{
    String name;
    int ModelNum;
    Boolean Sale;

    void setname(String name){
        this.name = name;
    }

    void setModelname(int model){
        this.ModelNum = model;
    }

    void setSale(Boolean sale){
        this.Sale  = sale;
    }

    void displaydata(){
        System.out.println(this.name + " for sale is " + this.Sale + ". This Model Number is : "+ this.ModelNum);
    }
}