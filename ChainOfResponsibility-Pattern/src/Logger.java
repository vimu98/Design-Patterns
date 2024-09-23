// Handler interface
abstract class Logger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;
    protected Logger nextLogger;

    // Method to set the next logger in the chain
    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    // Method to log a message
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    // Abstract method to write the message
    protected abstract void write(String message);
}
