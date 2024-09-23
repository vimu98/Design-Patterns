public class Main {
    public static void main(String[] args) {
        // Using modern furniture factory
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.sitOn();
        modernTable.eatOn();

        // Using vintage furniture factory
        FurnitureFactory vintageFactory = new VintageFurnitureFactory();
        Chair vintageChair = vintageFactory.createChair();
        Table vintageTable = vintageFactory.createTable();

        vintageChair.sitOn();
        vintageTable.eatOn();
    }
}