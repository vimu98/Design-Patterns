public class Main {
    public static void main(String[] args) {
        // Create a lazy proxy image
        Image lazyImage = new LazyProxyImage("test_image.jpg");
        lazyImage.display(); // Loading and then displaying
        lazyImage.display(); // Only displaying (already loaded)

        // Create a cache proxy image
        Image cacheImage = new CacheProxyImage("test_image.jpg");
        cacheImage.display(); // Loading and then displaying
        cacheImage.display(); // Only displaying (already loaded)
    }
}