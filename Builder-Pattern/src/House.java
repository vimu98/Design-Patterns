// Immutable House class
class House {
    private final String roof;
    private final String walls;

    // Constructor to initialize fields
    public House(String roof, String walls) {
        this.roof = roof;
        this.walls = walls;
    }

    // Getter methods for fields (no setters)
    public String getRoof() {
        return roof;
    }

    public String getWalls() {
        return walls;
    }

    @Override
    public String toString() {
        return "House with " + roof + " roof and " + walls + " walls";
    }
}
