public class Main {
    public static void main(String[] args) {
        House house = new HouseBuilder().buildRoof("Tile").buildWalls("Bricks").build();
        System.out.println(house);
    }
}