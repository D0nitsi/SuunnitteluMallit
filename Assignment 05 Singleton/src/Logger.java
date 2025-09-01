import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance; // Singleton instance
    private BufferedWriter writer; // Writer for file operations
    private String fileName; // Current log file name

    // Private constructor to prevent instantiation
    private Logger() {
        this.fileName = "default_log.txt"; // Default file name
        openFile(); // Open the default file
    }

    // Method to get the Singleton instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to set a new file name
    public synchronized void setFileName(String newFileName) {
        close(); // Close the current file
        this.fileName = newFileName; // Set the new file name
        openFile(); // Open the new file
    }

    // Method to write a log message
    public synchronized void write(String message) {
        try {
            writer.write(message);
            writer.newLine(); // Write each message on a new line
            writer.flush(); // Ensure the message is written immediately
        } catch (IOException e) {
            System.err.println("Error writing to log file: " + e.getMessage());
        }
    }

    // Method to close the writer
    public synchronized void close() {
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                System.err.println("Error closing the log file: " + e.getMessage());
            }
        }
    }

    // Helper method to open the file
    private void openFile() {
        try {
            writer = new BufferedWriter(new FileWriter(fileName, true)); // Append mode
        } catch (IOException e) {
            System.err.println("Error opening the log file: " + e.getMessage());
        }
    }
}