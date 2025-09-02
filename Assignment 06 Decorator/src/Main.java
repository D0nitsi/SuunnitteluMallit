public class Main {
    public static void main(String[] args) {
        // Basic Printer
        Printer printer = new BasicPrinter();
        printer.print("Hello World!");

        // Decorated Printer with XML and Encryption
        Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
        printer2.print("Hello World!");
    }
}