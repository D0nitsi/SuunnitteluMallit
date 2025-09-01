public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance(); // Get the Singleton instance

        logger.write("Application started"); // Write a log message
        logger.setFileName("new_log.txt"); // Change the log file
        logger.write("Switched to a new log file");
        logger.write("Logging another message");
        logger.close(); // Close the logger
    }
}