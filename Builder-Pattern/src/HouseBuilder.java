// Builder class for House
class HouseBuilder {
    private String roof;
    private String walls;

    // Method to set the roof
    public HouseBuilder buildRoof(String roof) {
        this.roof = roof;
        return this;
    }

    // Method to set the walls
    public HouseBuilder buildWalls(String walls) {
        this.walls = walls;
        return this;
    }

    // Final build method to create the House object
    public House build() {
        if (roof == null || walls == null) {
            throw new IllegalStateException("Both roof and walls must be set before building the house.");
        }
        return new House(roof, walls);
    }
}
