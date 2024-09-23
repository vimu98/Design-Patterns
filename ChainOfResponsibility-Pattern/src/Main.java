public class Main {
    public static void main(String[] args) {
        // Create loggers
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);
        Logger fileLogger = new FileLogger(Logger.DEBUG);

        // Set up the chain
        errorLogger.setNextLogger(consoleLogger);
        consoleLogger.setNextLogger(fileLogger);

        // Log messages
        errorLogger.logMessage(Logger.INFO, "This is an info message");
        errorLogger.logMessage(Logger.ERROR, "This is an error message");
        errorLogger.logMessage(Logger.DEBUG, "This is a debug message");
    }
}