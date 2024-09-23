// Proxy class for caching
class CacheProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    private boolean isCached;

    // Constructor to initialize the file name
    public CacheProxyImage(String fileName) {
        this.fileName = fileName;
        isCached = false;
    }

    @Override
    public void display() {
        if (!isCached) {
            realImage = new RealImage(fileName);
            isCached = true;
        }
        realImage.display();
    }
}
