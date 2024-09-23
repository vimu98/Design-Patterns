// Concrete factory class for vintage furniture
class VintageFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }
}
