// Proxy class for lazy loading
class LazyProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    // Constructor to initialize the file name
    public LazyProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
