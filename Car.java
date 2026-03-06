public class Car {
    //atribut
    private String brand;
    private String type;
    private String color;
    private int speed;

    //constructor (nama = class)
    public Car() {  //no parameter
    }

    public Car(String brand, String type, String color, int speed) { //with parameter
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.speed = speed;
    }

    //method
    public void accelerate(int speedIncrease) {
    }
    public String getBrand() {
        return brand;
    }
}
