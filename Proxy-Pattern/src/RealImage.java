// Real subject class
class RealImage implements Image {
    private String fileName;

    // Constructor to initialize the file name and load the image from disk
    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    // Method to load the image from disk
    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
