class Car {
    private String brand;
    private String model;
    private int year = 2010;

     Car(String BrandName, String ModelName, int YearBought ) {
        this.brand = BrandName;
        this.model = ModelName;
        this.year = YearBought;

           }

         Car(String BrandName, String ModelName ) {  //this is a constructor and constructor must have name same as class and can't hava a return type 
        this.brand = BrandName;
        this.model = ModelName;
        

       
    }

    void display() {
        System.out.println(" Brand:" + this.brand + " Model:" + this.model + " Year:" + this.year); // this is a method and method must have a return type with any name
    }

}

public class oops {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Ford", " Mustang", 2020);
        Car car3 = new Car("Toyota", " Supra MK4", 1998);
        car1.display();
        car2.display();
    }
}
