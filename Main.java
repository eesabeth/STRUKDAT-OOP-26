public class Main {
    public static void main(String[] args) throws Exception {

        Car myCar = new Car();
        Car myHonda = new Car("Honda", "Yellow", "Brio", 150);

        //Mengambil data brand melalui method getter
        System.out.println(myHonda.getBrand());
    }
}



