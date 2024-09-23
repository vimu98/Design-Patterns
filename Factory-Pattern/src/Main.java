public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.createCar(CarType.SEDAN);
        car.drive();
    }
}