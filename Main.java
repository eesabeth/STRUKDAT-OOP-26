public class Main {
    public static void main(String[] args) throws Exception {

        Car myCar = new Car();
        Car myHonda = new Car("Honda", "Yellow", "Brio", 150);

        System.out.println(myHonda.getBrand());
    }
}


