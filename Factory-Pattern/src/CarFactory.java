// CarFactory class
class CarFactory {
    // Factory method to create cars based on type
    static Car createCar(CarType type) {
        switch (type) {
            case SEDAN:
                return new Sedan();
            case SUV:
                return new SUV();
            default:
                throw new IllegalArgumentException("Invalid car type");
        }
    }
}
